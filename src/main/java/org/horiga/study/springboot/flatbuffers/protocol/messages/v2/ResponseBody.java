// automatically generated, do not modify

package org.horiga.study.springboot.flatbuffers.protocol.messages.v2;

public final class ResponseBody {
  private ResponseBody() { }
  public static final byte NONE = 0;
  public static final byte Error = 1;
  public static final byte Person = 2;
  public static final byte Friends = 3;

  private static final String[] names = { "NONE", "Error", "Person", "Friends", };

  public static String name(int e) { return names[e]; }
};

