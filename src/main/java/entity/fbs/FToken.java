// automatically generated, do not modify

package entity.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class FToken extends Table {
  public static FToken getRootAsFToken(ByteBuffer _bb) { return getRootAsFToken(_bb, new FToken()); }
  public static FToken getRootAsFToken(ByteBuffer _bb, FToken obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FToken __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int id() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String accessToken() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer accessTokenAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public long created() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0; }

  public static int createFToken(FlatBufferBuilder builder,
      int id,
      int accessToken,
      long created) {
    builder.startObject(3);
    FToken.addCreated(builder, created);
    FToken.addAccessToken(builder, accessToken);
    FToken.addId(builder, id);
    return FToken.endFToken(builder);
  }

  public static void startFToken(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(0, id, 0); }
  public static void addAccessToken(FlatBufferBuilder builder, int accessTokenOffset) { builder.addOffset(1, accessTokenOffset, 0); }
  public static void addCreated(FlatBufferBuilder builder, long created) { builder.addLong(2, created, 0); }
  public static int endFToken(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

