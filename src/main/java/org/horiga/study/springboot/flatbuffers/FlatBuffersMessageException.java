package org.horiga.study.springboot.flatbuffers;

import java.io.IOException;

/**
 * Created by horiga on 2015/09/12.
 */
public class FlatBuffersMessageException extends IOException {

	public FlatBuffersMessageException() {
		super();
	}

	public FlatBuffersMessageException(String message) {
		super(message);
	}

	public FlatBuffersMessageException(String message, Throwable cause) {
		super(message, cause);
	}

}
