package September_21st_30th_2019;

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    int number = Integer.MAX_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to check if prime or not");
    number = sc.nextInt();
    System.out.println(isPrimeNumber(number));
  }

  public static String isPrimeNumber(int number) {
    if (number <= 0) { return (number+" is not valid number"); }
    int sqrt = (int) Math.sqrt(number) + 1;
    for(int i=2;i<sqrt;i++) {
      if (number%i==0)  { return (number+" is not a prime number"); }
    }
    return (number+" is a prime number");
  }

}
