package September_21st_30th_2019;
import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {

    String s1 = "Keep";
    String s2 = "Peek";
    String ss1 = s1.replace(" ", "").trim();
    String ss2 = s2.replace(" ", "").trim();
    char[] c1 = ss1.toCharArray();
    char[] c2 = ss2.toCharArray();

    int l = 0;
    for (int i = 0; i < ss1.length(); i++) {
        char cc1 = c1[i];
        int count = 0;
        for (int j=0;j<ss2.length();j++) {
            char cc2 = c2[j];
            if(Character.toString(cc1).equalsIgnoreCase(Character.toString(cc2))) {
              count++;
            }
        }
      System.out.println(count);
        if (count != 0) { l++; }
    }
    System.out.println(l);
    if(l == ss1.length() && l == ss2.length()) { System.out.println("strings are anagram"); }
    else System.out.println("strings are not anagram");
  }
}
