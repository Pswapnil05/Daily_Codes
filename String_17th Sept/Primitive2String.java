package com.java.strings;

public class Primitive2String {

  public static void main(String[] args) {

    // method#1 using string.valueOf
    int i = 1000;
    String s = String.valueOf(i); // same for byte, short, int, long, char, float, double to String conversion
    System.out.println("binary + operator value = " + (i + 100));
    System.out.println("string concatenation operator = " + (s + 100));

    // method#2 using Integer.toString
    String s1 = Integer.toString(i); // for int to String conversion
    System.out.println("Integer to string = " + s1 + 10);
    long l = 123456789L;
    String s2 = Long.toString(l); // for long to String conversion
    System.out.println("Long to string = " + s2 + 87654321);
    float f = 999.111f;
    String s3 = Float.toString(f); // for float to String conversion
    System.out.println("Float to string = " + s3 + .999);
    double d = 12345.54321d;
    String s4 = Double.toString(d); // for double to String conversion
    System.out.println("Double to string = " + s4 + .12345);
    char c = '$';
    String s5 = Character.toString(c); // for char to String conversion
    System.out.println("Char to string = " + s5 + 87654321);

  }

}
