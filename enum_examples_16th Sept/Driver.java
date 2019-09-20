package com.java.enum_examples;

enum New_Car {
  AUDI, BMW(230), LAMBORGHINI(500);
  private int speed;

  New_Car() {
    speed = 103;
  }

  New_Car(int speed) {
    this.speed = speed;
  }

  public int getSpeed () {
    return speed;
  }
}

public class Driver {

  public static void main(String[] args) {
    System.out.println(New_Car.AUDI + " Max speed = " + New_Car.AUDI.getSpeed() + " mph");
    System.out.println(New_Car.BMW + " Max speed = " + New_Car.BMW.getSpeed() + " mph");
    System.out.println(New_Car.LAMBORGHINI + " Max speed = " + New_Car.LAMBORGHINI.getSpeed() + " mph");
  }
}
