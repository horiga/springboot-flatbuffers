package org.horiga.study.springboot.flatbuffers;

import com.google.flatbuffers.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
@Slf4j
public class FlatBuffersHttpMessageConverter extends AbstractHttpMessageConverter<Table> {

	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

	public static final MediaType X_FLATBUFFERS = new MediaType("application", "x-fb", DEFAULT_CHARSET);

	public static final String X_FLATBUFFERS_MESSAGE_ID = "X-FBS-MessageId";

	protected final Map<String, FlatBuffersMessage> messageRepository;

	public FlatBuffersHttpMessageConverter(Map<String, FlatBuffersMessage> messageRepository) {
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

		final String messageId = inputMessage.getHeaders().getFirst(X_FLATBUFFERS_MESSAGE_ID);
		log.debug("Request.messageId: {}", messageId);

		if(Objects.isNull(messageId) ||
				!messageRepository.containsKey(messageId)) {
			throw new HttpMessageNotReadableException("Unknown message protocol identifier");
		}

		final long contentLength = inputMessage.getHeaders().getContentLength();
		final ByteArrayOutputStream out =
				new ByteArrayOutputStream(contentLength >= 0 ? (int) contentLength : StreamUtils.BUFFER_SIZE);
		StreamUtils.copy(inputMessage.getBody(), out);

		return messageRepository.get(messageId).build(ByteBuffer.wrap(out.toByteArray()));
	}

	@Override
	protected void writeInternal(Table message, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
		setFlatBuffersResponseHeaders(message, outputMessage);

		final byte[] dst = new byte[getContentLength(message, X_FLATBUFFERS).intValue()];
		message.getByteBuffer().get(dst);

		StreamUtils.copy(dst, outputMessage.getBody());
	}

	@Override
	protected Long getContentLength(Table table, MediaType contentType) throws IOException {
		final ByteBuffer buf = table.getByteBuffer();
		return (long) (buf.limit() - buf.position());
	}

	private void setFlatBuffersResponseHeaders(final Table message, final HttpOutputMessage outputMessage) {
		// debug
	}
}
