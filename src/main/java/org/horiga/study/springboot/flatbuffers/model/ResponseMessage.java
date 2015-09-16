package org.horiga.study.springboot.flatbuffers.model;

import com.google.flatbuffers.Table;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

@Builder
@Getter
@ToString(callSuper = false, includeFieldNames = false)
public class ResponseMessage {
	final Integer messageId;
	final Table table;
}
