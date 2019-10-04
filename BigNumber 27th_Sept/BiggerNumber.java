package September_21st_30th_2019;

import java.util.Scanner;

public class BiggerNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number");
    int num1 = sc.nextInt();
    System.out.println("Enter 2nd number");
    int num2 = sc.nextInt();
    sc.close();
    if(num1>num2) System.out.println(num1+" is bigger than "+num2);
    else if(num1<num2) System.out.println(num2+" is bigger than "+num1);
    else System.out.println(num1+" is equal to "+num2);
  }
}
