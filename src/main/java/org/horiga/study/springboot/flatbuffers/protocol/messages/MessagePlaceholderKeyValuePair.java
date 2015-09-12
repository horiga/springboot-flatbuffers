// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MessagePlaceholderKeyValuePair extends Table {
  public static MessagePlaceholderKeyValuePair getRootAsMessagePlaceholderKeyValuePair(ByteBuffer _bb) { return getRootAsMessagePlaceholderKeyValuePair(_bb, new MessagePlaceholderKeyValuePair()); }
  public static MessagePlaceholderKeyValuePair getRootAsMessagePlaceholderKeyValuePair(ByteBuffer _bb, MessagePlaceholderKeyValuePair obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MessagePlaceholderKeyValuePair __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String key() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer keyAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String value() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createMessagePlaceholderKeyValuePair(FlatBufferBuilder builder,
      int key,
      int value) {
    builder.startObject(2);
    MessagePlaceholderKeyValuePair.addValue(builder, value);
    MessagePlaceholderKeyValuePair.addKey(builder, key);
    return MessagePlaceholderKeyValuePair.endMessagePlaceholderKeyValuePair(builder);
  }

  public static void startMessagePlaceholderKeyValuePair(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addKey(FlatBufferBuilder builder, int keyOffset) { builder.addOffset(0, keyOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(1, valueOffset, 0); }
  public static int endMessagePlaceholderKeyValuePair(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

