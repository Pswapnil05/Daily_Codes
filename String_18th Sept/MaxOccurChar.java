

public class MaxOccurChar {
//  static final int ASCII=256;

  static char getmaxOccChar(String str) {
    int[] count = new int[256];
    int len = str.length();
    for (int i=0; i<len;i++) {
    count[str.charAt(i)]++;
    }
    int max=0;
    char result=' ';
    for (int i=0;i<len;i++) {
        if (max<count[str.charAt(i)]) {
            max=count[str.charAt(i)];
            result=str.charAt(i);
        }
    }
    return result;
  }
  public static void main(String[] args) {

     String str= "HELLOL WORLDHHHEEE";
     System.out.println("max occuring character is = "+getmaxOccChar(str));


  }
}