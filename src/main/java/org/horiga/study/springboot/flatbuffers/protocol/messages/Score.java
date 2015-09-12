// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Score extends Table {
  public static Score getRootAsScore(ByteBuffer _bb) { return getRootAsScore(_bb, new Score()); }
  public static Score getRootAsScore(ByteBuffer _bb, Score obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Score __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int mi() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 2; }
  public String factor() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer factorAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public double score() { int o = __offset(8); return o != 0 ? bb.getDouble(o + bb_pos) : 0; }

  public static int createScore(FlatBufferBuilder builder,
      int mi,
      int factor,
      double score) {
    builder.startObject(3);
    Score.addScore(builder, score);
    Score.addFactor(builder, factor);
    Score.addMi(builder, mi);
    return Score.endScore(builder);
  }

  public static void startScore(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addMi(FlatBufferBuilder builder, int mi) { builder.addInt(0, mi, 2); }
  public static void addFactor(FlatBufferBuilder builder, int factorOffset) { builder.addOffset(1, factorOffset, 0); }
  public static void addScore(FlatBufferBuilder builder, double score) { builder.addDouble(2, score, 0); }
  public static int endScore(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

