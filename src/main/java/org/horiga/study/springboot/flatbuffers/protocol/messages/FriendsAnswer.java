// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FriendsAnswer extends Table {
  public static FriendsAnswer getRootAsFriendsAnswer(ByteBuffer _bb) { return getRootAsFriendsAnswer(_bb, new FriendsAnswer()); }
  public static FriendsAnswer getRootAsFriendsAnswer(ByteBuffer _bb, FriendsAnswer obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public FriendsAnswer __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int total() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int start() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int count() { int o = __offset(8); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public User members(int j) { return members(new User(), j); }
  public User members(User obj, int j) { int o = __offset(10); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int membersLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }

  public static int createFriendsAnswer(FlatBufferBuilder builder,
      int total,
      int start,
      int count,
      int members) {
    builder.startObject(4);
    FriendsAnswer.addMembers(builder, members);
    FriendsAnswer.addCount(builder, count);
    FriendsAnswer.addStart(builder, start);
    FriendsAnswer.addTotal(builder, total);
    return FriendsAnswer.endFriendsAnswer(builder);
  }

  public static void startFriendsAnswer(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addTotal(FlatBufferBuilder builder, int total) { builder.addInt(0, total, 0); }
  public static void addStart(FlatBufferBuilder builder, int start) { builder.addInt(1, start, 0); }
  public static void addCount(FlatBufferBuilder builder, int count) { builder.addInt(2, count, 0); }
  public static void addMembers(FlatBufferBuilder builder, int membersOffset) { builder.addOffset(3, membersOffset, 0); }
  public static int createMembersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startMembersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endFriendsAnswer(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

