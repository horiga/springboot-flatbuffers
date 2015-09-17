// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Request extends Table {
  public static Request getRootAsRequest(ByteBuffer _bb) { return getRootAsRequest(_bb, new Request()); }
  public static Request getRootAsRequest(ByteBuffer _bb, Request obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Request __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int msg() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public Token token() { return token(new Token()); }
  public Token token(Token obj) { int o = __offset(6); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public byte bodyType() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table body(Table obj) { int o = __offset(10); return o != 0 ? __union(obj, o) : null; }

  public static int createRequest(FlatBufferBuilder builder,
      int msg,
      int token,
      byte body_type,
      int body) {
    builder.startObject(4);
    Request.addBody(builder, body);
    Request.addToken(builder, token);
    Request.addMsg(builder, msg);
    Request.addBodyType(builder, body_type);
    return Request.endRequest(builder);
  }

  public static void startRequest(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addMsg(FlatBufferBuilder builder, int msg) { builder.addInt(0, msg, 0); }
  public static void addToken(FlatBufferBuilder builder, int tokenOffset) { builder.addOffset(1, tokenOffset, 0); }
  public static void addBodyType(FlatBufferBuilder builder, byte bodyType) { builder.addByte(2, bodyType, 0); }
  public static void addBody(FlatBufferBuilder builder, int bodyOffset) { builder.addOffset(3, bodyOffset, 0); }
  public static int endRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

