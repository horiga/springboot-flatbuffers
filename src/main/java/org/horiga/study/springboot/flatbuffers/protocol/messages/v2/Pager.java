// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Pager extends Table {
  public static Pager getRootAsPager(ByteBuffer _bb) { return getRootAsPager(_bb, new Pager()); }
  public static Pager getRootAsPager(ByteBuffer _bb, Pager obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Pager __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int offset() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int limit() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }

  public static int createPager(FlatBufferBuilder builder,
      int offset,
      int limit) {
    builder.startObject(2);
    Pager.addLimit(builder, limit);
    Pager.addOffset(builder, offset);
    return Pager.endPager(builder);
  }

  public static void startPager(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addOffset(FlatBufferBuilder builder, int offset) { builder.addInt(0, offset, 0); }
  public static void addLimit(FlatBufferBuilder builder, int limit) { builder.addInt(1, limit, 0); }
  public static int endPager(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

