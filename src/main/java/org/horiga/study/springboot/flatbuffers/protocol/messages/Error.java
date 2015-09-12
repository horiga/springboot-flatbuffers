// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Error extends Table {
  public static Error getRootAsError(ByteBuffer _bb) { return getRootAsError(_bb, new Error()); }
  public static Error getRootAsError(ByteBuffer _bb, Error obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Error __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String code() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer codeAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String message() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer messageAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createError(FlatBufferBuilder builder,
      int code,
      int message) {
    builder.startObject(2);
    Error.addMessage(builder, message);
    Error.addCode(builder, code);
    return Error.endError(builder);
  }

  public static void startError(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addCode(FlatBufferBuilder builder, int codeOffset) { builder.addOffset(0, codeOffset, 0); }
  public static void addMessage(FlatBufferBuilder builder, int messageOffset) { builder.addOffset(1, messageOffset, 0); }
  public static int endError(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

