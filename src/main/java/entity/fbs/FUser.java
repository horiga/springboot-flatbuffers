// automatically generated, do not modify

package entity.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class FUser extends Table {
  public static FUser getRootAsFUser(ByteBuffer _bb) { return getRootAsFUser(_bb, new FUser()); }
  public static FUser getRootAsFUser(ByteBuffer _bb, FUser obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FUser __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String displayName() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer displayNameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String mid() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer midAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String pictureUrl() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer pictureUrlAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }

  public static int createFUser(FlatBufferBuilder builder,
      int displayName,
      int mid,
      int pictureUrl) {
    builder.startObject(3);
    FUser.addPictureUrl(builder, pictureUrl);
    FUser.addMid(builder, mid);
    FUser.addDisplayName(builder, displayName);
    return FUser.endFUser(builder);
  }

  public static void startFUser(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addDisplayName(FlatBufferBuilder builder, int displayNameOffset) { builder.addOffset(0, displayNameOffset, 0); }
  public static void addMid(FlatBufferBuilder builder, int midOffset) { builder.addOffset(1, midOffset, 0); }
  public static void addPictureUrl(FlatBufferBuilder builder, int pictureUrlOffset) { builder.addOffset(2, pictureUrlOffset, 0); }
  public static int endFUser(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

