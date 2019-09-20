package September_20th_2019;

public class String2Char {

  public static void main(String[] args) {
    String str = "GRAMMER";
    char[] c = str.toCharArray();
    int count = 0;
    for (int i = 0; i < c.length; i++) {
      boolean flag = true;
      for (int k = 0; k < i; k++) {
        if (c[i] == str.charAt(k)) {
          flag = false;
        }
      }
      if (flag) {
        System.out.print(c[i] + " -> ");
        for (int j = 0; j < str.length(); j++) {
          if (c[i] == str.charAt(j)) {
            count = count + 1;
          }
          System.out.print(count + " ");
          count = 0;
        }
        System.out.println();
      }
    }
  }
}
