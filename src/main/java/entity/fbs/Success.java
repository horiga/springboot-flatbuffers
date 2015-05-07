// automatically generated, do not modify

package entity.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class Success extends Table {
  public static Success getRootAsSuccess(ByteBuffer _bb) { return getRootAsSuccess(_bb, new Success()); }
  public static Success getRootAsSuccess(ByteBuffer _bb, Success obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Success __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }


  public static void startSuccess(FlatBufferBuilder builder) { builder.startObject(0); }
  public static int endSuccess(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

