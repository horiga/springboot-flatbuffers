// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class TextMessage extends Table {
  public static TextMessage getRootAsTextMessage(ByteBuffer _bb) { return getRootAsTextMessage(_bb, new TextMessage()); }
  public static TextMessage getRootAsTextMessage(ByteBuffer _bb, TextMessage obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public TextMessage __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String to(int j) { int o = __offset(6); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int toLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public MessagePlaceholderKeyValuePair placeholders(int j) { return placeholders(new MessagePlaceholderKeyValuePair(), j); }
  public MessagePlaceholderKeyValuePair placeholders(MessagePlaceholderKeyValuePair obj, int j) { int o = __offset(8); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int placeholdersLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createTextMessage(FlatBufferBuilder builder,
      int id,
      int to,
      int placeholders) {
    builder.startObject(3);
    TextMessage.addPlaceholders(builder, placeholders);
    TextMessage.addTo(builder, to);
    TextMessage.addId(builder, id);
    return TextMessage.endTextMessage(builder);
  }

  public static void startTextMessage(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addTo(FlatBufferBuilder builder, int toOffset) { builder.addOffset(1, toOffset, 0); }
  public static int createToVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startToVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addPlaceholders(FlatBufferBuilder builder, int placeholdersOffset) { builder.addOffset(2, placeholdersOffset, 0); }
  public static int createPlaceholdersVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPlaceholdersVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endTextMessage(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

