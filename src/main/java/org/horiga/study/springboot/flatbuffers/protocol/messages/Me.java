// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Me extends Table {
  public static Me getRootAsMe(ByteBuffer _bb) { return getRootAsMe(_bb, new Me()); }
  public static Me getRootAsMe(ByteBuffer _bb, Me obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Me __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Token token() { return token(new Token()); }
  public Token token(Token obj) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }

  public static int createMe(FlatBufferBuilder builder,
      int token) {
    builder.startObject(1);
    Me.addToken(builder, token);
    return Me.endMe(builder);
  }

  public static void startMe(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(0, tokenOffset, 0); }
  public static int endMe(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

