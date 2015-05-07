// automatically generated, do not modify

package entity.fbs;

public final class Status {
  private Status() { }
  public static final byte RED = 1;
  public static final byte YELLOW = 2;
  public static final byte GREEN = 3;

  private static final String[] names = { "RED", "YELLOW", "GREEN", };

  public static String name(int e) { return names[e - RED]; }
};

