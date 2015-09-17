// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Friends extends Table {
  public static Friends getRootAsFriends(ByteBuffer _bb) { return getRootAsFriends(_bb, new Friends()); }
  public static Friends getRootAsFriends(ByteBuffer _bb, Friends obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Friends __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int total() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int offset() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int limit() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public Person entity(int j) { return entity(new Person(), j); }
  public Person entity(Person obj, int j) { int o = __offset(10); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int entityLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }

  public static int createFriends(FlatBufferBuilder builder,
      int total,
      int offset,
      int limit,
      int entity) {
    builder.startObject(4);
    Friends.addEntity(builder, entity);
    Friends.addLimit(builder, limit);
    Friends.addOffset(builder, offset);
    Friends.addTotal(builder, total);
    return Friends.endFriends(builder);
  }

  public static void startFriends(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addTotal(FlatBufferBuilder builder, int total) { builder.addInt(0, total, 0); }
  public static void addOffset(FlatBufferBuilder builder, int offset) { builder.addInt(1, offset, 0); }
  public static void addLimit(FlatBufferBuilder builder, int limit) { builder.addInt(2, limit, 0); }
  public static void addEntity(FlatBufferBuilder builder, int entityOffset) { builder.addOffset(3, entityOffset, 0); }
  public static int createEntityVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startEntityVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFriends(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

