// automatically generated, do not modify

package entity.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class FResponse extends Table {
  public static FResponse getRootAsFResponse(ByteBuffer _bb) { return getRootAsFResponse(_bb, new FResponse()); }
  public static FResponse getRootAsFResponse(ByteBuffer _bb, FResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FResponse __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public byte status() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 1; }
  public byte resultType() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table result(Table obj) { int o = __offset(8); return o != 0 ? __union(obj, o) : null; }

  public static int createFResponse(FlatBufferBuilder builder,
      byte status,
      byte result_type,
      int result) {
    builder.startObject(3);
    FResponse.addResult(builder, result);
    FResponse.addResultType(builder, result_type);
    FResponse.addStatus(builder, status);
    return FResponse.endFResponse(builder);
  }

  public static void startFResponse(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addStatus(FlatBufferBuilder builder, byte status) { builder.addByte(0, status, 1); }
  public static void addResultType(FlatBufferBuilder builder, byte resultType) { builder.addByte(1, resultType, 0); }
  public static void addResult(FlatBufferBuilder builder, int resultOffset) { builder.addOffset(2, resultOffset, 0); }
  public static int endFResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

