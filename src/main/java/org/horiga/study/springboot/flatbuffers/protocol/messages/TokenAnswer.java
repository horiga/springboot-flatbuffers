// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TokenAnswer extends Table {
  public static TokenAnswer getRootAsTokenAnswer(ByteBuffer _bb) { return getRootAsTokenAnswer(_bb, new TokenAnswer()); }
  public static TokenAnswer getRootAsTokenAnswer(ByteBuffer _bb, TokenAnswer obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public TokenAnswer __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Token token() { return token(new Token()); }
  public Token token(Token obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public long expired() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0; }

  public static int createTokenAnswer(FlatBufferBuilder builder,
      int token,
      long expired) {
    builder.startObject(2);
    TokenAnswer.addExpired(builder, expired);
    TokenAnswer.addToken(builder, token);
    return TokenAnswer.endTokenAnswer(builder);
  }

  public static void startTokenAnswer(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(0, tokenOffset, 0); }
  public static void addExpired(FlatBufferBuilder builder, long expired) { builder.addLong(1, expired, 0); }
  public static int endTokenAnswer(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

