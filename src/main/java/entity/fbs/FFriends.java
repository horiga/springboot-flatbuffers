// automatically generated, do not modify

package entity.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class FFriends extends Table {
  public static FFriends getRootAsFFriends(ByteBuffer _bb) { return getRootAsFFriends(_bb, new FFriends()); }
  public static FFriends getRootAsFFriends(ByteBuffer _bb, FFriends obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FFriends __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public FUser members(int j) { return members(new FUser(), j); }
  public FUser members(FUser obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int membersLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createFFriends(FlatBufferBuilder builder,
      int members) {
    builder.startObject(1);
    FFriends.addMembers(builder, members);
    return FFriends.endFFriends(builder);
  }

  public static void startFFriends(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addMembers(FlatBufferBuilder builder, int membersOffset) { builder.addOffset(0, membersOffset, 0); }
  public static int createMembersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMembersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFFriends(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

