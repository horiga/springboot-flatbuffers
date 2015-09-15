package org.horiga.study.springboot.flatbuffers;

import java.io.IOException;

/**
 * Created by horiga on 2015/09/12.
 */
public class FlatBuffersMessageProtocolException extends IOException {

	public FlatBuffersMessageProtocolException() {
		super();
	}

	public FlatBuffersMessageProtocolException(String message) {
		super(message);
	}

	public FlatBuffersMessageProtocolException(String message, Throwable cause) {
		super(message, cause);
	}

}
