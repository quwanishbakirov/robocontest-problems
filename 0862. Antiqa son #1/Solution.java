import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       boolean flag = true;
       String san = in.nextLine();

       StringBuffer sb = new StringBuffer();
       StringBuffer temp = new StringBuffer(san);
       temp = temp.reverse();
       for (int i = 0; i < temp.length(); i++) {
           switch (temp.charAt(i)) {
               case '0' -> sb.append('0');
               case '1' -> sb.append('1');
               case '6' -> sb.append('9');
               case '8' -> sb.append('8');
               case '9' -> sb.append('6');
               default -> flag = false;
           }
       }
       if (flag && san.equals(String.valueOf(sb))) {
           System.out.println("YES");
       } else {
           System.out.println("NO");
       }
    }
}
