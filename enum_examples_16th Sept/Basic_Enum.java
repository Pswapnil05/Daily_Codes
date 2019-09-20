package com.java.enum_examples;

enum car {
  AUDI, BMW, LAMBORGHINI;

  private car() {
    System.out.println("only once- 3 times constructor is called for 3 enum values (objects) when any 1 of enum value is accessed or called.");
  }
}

public class Basic_Enum {

  public static void main(String[] args) {
    System.out.println("Only Audi object is called = " + car.AUDI);
    System.out.println("All three objects are called = " + car.AUDI + ", " + car.BMW + " & " + car.LAMBORGHINI);
  }
}
