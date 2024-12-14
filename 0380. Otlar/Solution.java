import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

           String x1 = in.next();
           switch (x1) {
               case "a" -> x1 = "1";
               case "b" -> x1 = "2";
               case "c" -> x1 = "3";
               case "d" -> x1 = "4";
               case "e" -> x1 = "5";
               case "f" -> x1 = "6";
               case "g" -> x1 = "7";
               case "h" -> x1 = "8";
           }
           int y1 = in.nextInt();
           String x2 = in.next();
           switch (x2) {
                case "a" -> x2 = "1";
                case "b" -> x2 = "2";
                case "c" -> x2 = "3";
                case "d" -> x2 = "4";
                case "e" -> x2 = "5";
                case "f" -> x2 = "6";
                case "g" -> x2 = "7";
                case "h" -> x2 = "8";
            }
            int y2 = in.nextInt();
        if((Math.abs(Integer.parseInt(x1)-Integer.parseInt(x2)) == 1 &&  Math.abs(y1 - y2) == 2) || (Math.abs(Integer.parseInt(x1) - Integer.parseInt(x2)) == 2 &&  Math.abs(y1 - y2) == 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
