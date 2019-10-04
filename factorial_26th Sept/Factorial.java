package September_21st_30th_2019;

import java.util.Scanner;

public class Factorial {

  public static Integer factorialRecursion(Integer number) {
    if (number == 0) {
      return 1;
    }
    return number * factorialRecursion(number - 1);
  }

  public static Integer factorialIteration(Integer number) {
    int result = 1;
    while (number != 0) {
      result = result * number;
      number--;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number for factorial by recursion");
    Integer recurNumber = sc.nextInt();
    System.out.println("Enter the number for factorial by iteration");
    Integer iterNumber = sc.nextInt();
    System.out.println("factorial of "+iterNumber+" using iteration is: " + factorialIteration(iterNumber));
    System.out.println("factorial of "+recurNumber+" using recursion is: " + factorialRecursion(recurNumber));

  }
}
