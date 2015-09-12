package org.horiga.study.springboot.flatbuffers;

import com.google.common.collect.Maps;
import com.google.flatbuffers.Table;
import entity.fbs.social.FUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
@Slf4j
public class FlatBuffersHttpMessageConverter extends AbstractHttpMessageConverter<Table> {

	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

	public static final MediaType X_FLATBUFFERS = new MediaType("application", "x-fb", DEFAULT_CHARSET);

	public static final String X_FLATBUFFERS_MESSAGE_ID = "X-FlatBuffers-MessageId";

	public static final int MAX_MESSAGE_BYTES = 1024 * 10;

	private int maxReadableBytes = MAX_MESSAGE_BYTES;

	protected final Map<String, FMessage> messageRepository;

	public FlatBuffersHttpMessageConverter(Map<String, FMessage> messageRepository) {
		super(X_FLATBUFFERS);
		this.messageRepository = messageRepository;
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return Table.class.isAssignableFrom(clazz);
	}

	@Override
	protected Table readInternal(Class<? extends Table> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {

		final String fbMessageId = inputMessage.getHeaders().getFirst(X_FLATBUFFERS_MESSAGE_ID);
		if(!messageRepository.containsKey(fbMessageId)) {
			throw new HttpMessageNotReadableException("");
		}

		final InputStream stream = inputMessage.getBody();
		int available = stream.available();
		if( available > maxReadableBytes) {
			throw new HttpMessageNotReadableException("");
		}

		byte[] readBytes = new byte[available];
		stream.read(readBytes);

		return messageRepository.get(fbMessageId).build(ByteBuffer.wrap(readBytes));
	}

	@Override
	protected void writeInternal(Table message, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

	}

	private Charset getCharset(HttpHeaders headers) {
		if (headers == null || headers.getContentType() == null || headers.getContentType().getCharSet() == null) {
			return DEFAULT_CHARSET;
		}
		return headers.getContentType().getCharSet();
	}

	public void setMaxReadableBytes(int max) {
		this.maxReadableBytes = max;
	}

}
