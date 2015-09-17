// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Token extends Table {
  public static Token getRootAsToken(ByteBuffer _bb) { return getRootAsToken(_bb, new Token()); }
  public static Token getRootAsToken(ByteBuffer _bb, Token obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Token __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String token() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer tokenAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }

  public static int createToken(FlatBufferBuilder builder,
      int token) {
    builder.startObject(1);
    Token.addToken(builder, token);
    return Token.endToken(builder);
  }

  public static void startToken(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(0, tokenOffset, 0); }
  public static int endToken(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

