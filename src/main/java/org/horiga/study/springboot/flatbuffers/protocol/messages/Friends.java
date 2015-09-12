// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Friends extends Table {
  public static Friends getRootAsFriends(ByteBuffer _bb) { return getRootAsFriends(_bb, new Friends()); }
  public static Friends getRootAsFriends(ByteBuffer _bb, Friends obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Friends __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Token token() { return token(new Token()); }
  public Token token(Token obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public PagerCondition condition() { return condition(new PagerCondition()); }
  public PagerCondition condition(PagerCondition obj) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }

  public static int createFriends(FlatBufferBuilder builder,
      int token,
      int condition) {
    builder.startObject(2);
    Friends.addCondition(builder, condition);
    Friends.addToken(builder, token);
    return Friends.endFriends(builder);
  }

  public static void startFriends(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(0, tokenOffset, 0); }
  public static void addCondition(FlatBufferBuilder builder, int conditionOffset) { builder.addOffset(1, conditionOffset, 0); }
  public static int endFriends(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

