package September_21st_30th_2019;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println("enter number upto which Fibonacci series to print");
    int number = new Scanner(System.in).nextInt();
    System.out.println("Fibonacci series upto "+number+" numbers: ");
    for (int i=1;i<=number;i++) {
      System.out.print(fibonacci(i)+" ");
    }
  }

  private static int fibonacci(int number) {
    int fibo1=1, fibo2=1, fibonaci = 1;
    for(int i=3;i<=number;i++){
      fibonaci=fibo1+fibo2;
      fibo1=fibo2;
      fibo2=fibonaci;
    }
    return fibonaci;
  }

}
