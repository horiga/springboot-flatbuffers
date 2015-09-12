// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PagerCondition extends Table {
  public static PagerCondition getRootAsPagerCondition(ByteBuffer _bb) { return getRootAsPagerCondition(_bb, new PagerCondition()); }
  public static PagerCondition getRootAsPagerCondition(ByteBuffer _bb, PagerCondition obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PagerCondition __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int start() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int count() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String filterBy() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filterByAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String filterValue() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer filterValueAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }

  public static int createPagerCondition(FlatBufferBuilder builder,
      int start,
      int count,
      int filterBy,
      int filterValue) {
    builder.startObject(4);
    PagerCondition.addFilterValue(builder, filterValue);
    PagerCondition.addFilterBy(builder, filterBy);
    PagerCondition.addCount(builder, count);
    PagerCondition.addStart(builder, start);
    return PagerCondition.endPagerCondition(builder);
  }

  public static void startPagerCondition(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addStart(FlatBufferBuilder builder, int start) { builder.addInt(0, start, 0); }
  public static void addCount(FlatBufferBuilder builder, int count) { builder.addInt(1, count, 0); }
  public static void addFilterBy(FlatBufferBuilder builder, int filterByOffset) { builder.addOffset(2, filterByOffset, 0); }
  public static void addFilterValue(FlatBufferBuilder builder, int filterValueOffset) { builder.addOffset(3, filterValueOffset, 0); }
  public static int endPagerCondition(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

