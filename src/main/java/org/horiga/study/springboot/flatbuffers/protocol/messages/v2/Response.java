// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Response extends Table {
  public static Response getRootAsResponse(ByteBuffer _bb) { return getRootAsResponse(_bb, new Response()); }
  public static Response getRootAsResponse(ByteBuffer _bb, Response obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Response __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int msg() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public byte bodyType() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public Table body(Table obj) { int o = __offset(8); return o != 0 ? __union(obj, o) : null; }

  public static int createResponse(FlatBufferBuilder builder,
      int msg,
      byte body_type,
      int body) {
    builder.startObject(3);
    Response.addBody(builder, body);
    Response.addMsg(builder, msg);
    Response.addBodyType(builder, body_type);
    return Response.endResponse(builder);
  }

  public static void startResponse(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addMsg(FlatBufferBuilder builder, int msg) { builder.addInt(0, msg, 0); }
  public static void addBodyType(FlatBufferBuilder builder, byte bodyType) { builder.addByte(1, bodyType, 0); }
  public static void addBody(FlatBufferBuilder builder, int bodyOffset) { builder.addOffset(2, bodyOffset, 0); }
  public static int endResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

