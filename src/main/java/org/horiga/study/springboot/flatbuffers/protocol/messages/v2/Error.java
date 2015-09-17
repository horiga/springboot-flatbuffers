// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Error extends Table {
  public static Error getRootAsError(ByteBuffer _bb) { return getRootAsError(_bb, new Error()); }
  public static Error getRootAsError(ByteBuffer _bb, Error obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Error __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int code() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String detail() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer detailAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createError(FlatBufferBuilder builder,
      int code,
      int detail) {
    builder.startObject(2);
    Error.addDetail(builder, detail);
    Error.addCode(builder, code);
    return Error.endError(builder);
  }

  public static void startError(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addCode(FlatBufferBuilder builder, int code) { builder.addInt(0, code, 0); }
  public static void addDetail(FlatBufferBuilder builder, int detailOffset) { builder.addOffset(1, detailOffset, 0); }
  public static int endError(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

