// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Demo extends Table {
  public static Demo getRootAsDemo(ByteBuffer _bb) { return getRootAsDemo(_bb, new Demo()); }
  public static Demo getRootAsDemo(ByteBuffer _bb, Demo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Demo __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public short point() { int o = __offset(4); return o != 0 ? bb.getShort(o + bb_pos) : 0; }
  public double score() { int o = __offset(6); return o != 0 ? bb.getDouble(o + bb_pos) : 0; }
  public boolean flags() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createDemo(FlatBufferBuilder builder,
      short point,
      double score,
      boolean flags) {
    builder.startObject(3);
    Demo.addScore(builder, score);
    Demo.addPoint(builder, point);
    Demo.addFlags(builder, flags);
    return Demo.endDemo(builder);
  }

  public static void startDemo(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addPoint(FlatBufferBuilder builder, short point) { builder.addShort(0, point, 0); }
  public static void addScore(FlatBufferBuilder builder, double score) { builder.addDouble(1, score, 0); }
  public static void addFlags(FlatBufferBuilder builder, boolean flags) { builder.addBoolean(2, flags, false); }
  public static int endDemo(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

