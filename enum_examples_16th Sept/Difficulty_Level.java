package com.java.enum_examples;

enum Difficulty_Level {
  LOW, MEDIUM, HIGH;

  Difficulty_Level() {
    System.out.println("3 times enum constructor is called for 3 enum values ie: 3 Objects only once");
  }

  public static void main(String[] args) {

    System.out.println("Enum Object chosen = " + Difficulty_Level.HIGH);

    for (Difficulty_Level val : Difficulty_Level.values()) {
      switch (val) {
        case LOW:
          System.out.println("Low level");
          break;
        case MEDIUM:
          System.out.println("Medium level");
          break;
        case HIGH:
          System.out.println("High level");
          break;
      }
    }
  }
}
