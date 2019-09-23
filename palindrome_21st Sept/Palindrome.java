package September_21st_30th_2019;

public class Palindrome {

  public static void main(String[] args) {
    String s = "abcdedcba";
    System.out.println(is_palindrome(s));
  }

  private static String is_palindrome(String s) {
    String reverse = "";
    char[] arr = s.toCharArray();
    for (int i = s.length() - 1; i >= 0; i--) {
      reverse += arr[i];
    }
    if (s.equals(reverse)) {
      return "String s is a palindrome.";
    } else {
      return "string s is not a palindrome.";
    }
  }
}
