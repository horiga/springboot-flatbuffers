// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Person extends Table {
  public static Person getRootAsPerson(ByteBuffer _bb) { return getRootAsPerson(_bb, new Person()); }
  public static Person getRootAsPerson(ByteBuffer _bb, Person obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Person __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String userId() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer userIdAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String displayName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer displayNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String thumbnail() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer thumbnailAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }

  public static int createPerson(FlatBufferBuilder builder,
      int userId,
      int displayName,
      int thumbnail) {
    builder.startObject(3);
    Person.addThumbnail(builder, thumbnail);
    Person.addDisplayName(builder, displayName);
    Person.addUserId(builder, userId);
    return Person.endPerson(builder);
  }

  public static void startPerson(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addUserId(FlatBufferBuilder builder, int userIdOffset) { builder.addOffset(0, userIdOffset, 0); }
  public static void addDisplayName(FlatBufferBuilder builder, int displayNameOffset) { builder.addOffset(1, displayNameOffset, 0); }
  public static void addThumbnail(FlatBufferBuilder builder, int thumbnailOffset) { builder.addOffset(2, thumbnailOffset, 0); }
  public static int endPerson(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

