// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class User extends Table {
  public static User getRootAsUser(ByteBuffer _bb) { return getRootAsUser(_bb, new User()); }
  public static User getRootAsUser(ByteBuffer _bb, User obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public User __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Token token() { return token(new Token()); }
  public Token token(Token obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public String ids(int j) { int o = __offset(6); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int idsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }

  public static int createUser(FlatBufferBuilder builder,
      int token,
      int ids) {
    builder.startObject(2);
    User.addIds(builder, ids);
    User.addToken(builder, token);
    return User.endUser(builder);
  }

  public static void startUser(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(0, tokenOffset, 0); }
  public static void addIds(FlatBufferBuilder builder, int idsOffset) { builder.addOffset(1, idsOffset, 0); }
  public static int createIdsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startIdsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endUser(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

