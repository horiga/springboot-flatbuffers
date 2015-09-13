package org.horiga.study.springboot.flatbuffers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.horiga.study.springboot.flatbuffers.protocol.messages.Me;
import org.horiga.study.springboot.flatbuffers.protocol.messages.Score;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@SpringBootApplication
@Slf4j
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModules(new AfterburnerModule(), new JSR310Module());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper;
    }

    @Bean
    FlatBuffersHttpMessageConverter flatBuffersHttpMessageConverter() {
        try {
            Map<String, FMessage> repo = Maps.newHashMap();
            repo.put("1", new FMessage("1", Me.class));
            repo.put("2", new FMessage("2", Score.class));

            return new FlatBuffersHttpMessageConverter(repo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(flatBuffersHttpMessageConverter());
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(FlatBuffersHttpMessageConverter.X_FLATBUFFERS);
    }

    // Withdraw Server header directives.
    @Bean
    JettyServerCustomizer jettyServerCustomizer() {
        return server -> {
            Stream.of(server.getConnectors())
                    .flatMap(conn -> conn.getConnectionFactories().stream())
                    .flatMap(f -> (f instanceof HttpConnectionFactory) ?
                            Stream.of((HttpConnectionFactory) f) : Stream.empty())
                    .forEach(f -> f.getHttpConfiguration().setSendServerVersion(false));
        };
    }

    @Bean
    JettyEmbeddedServletContainerFactory jettyEmbeddedServletContainerFactory(
            JettyServerCustomizer[] customizer
    ) {
        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory();
        factory.addServerCustomizers(customizer);
        return factory;
    }
}
