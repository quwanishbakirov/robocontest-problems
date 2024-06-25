import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t1 = in.nextLine();
        String t2 = in.nextLine();
        String a1 = "", a2 = "", a3 = "";
        String b1 = "", b2 = "", b3 = "";
        float d = 0, d1=0, d2=0;
        for (int i = 0; i < t1.indexOf('x'); i++) {
            a1 = a1.concat(String.valueOf(t1.charAt(i)));
        }
        for (int i = t1.indexOf('x') + 1; i < t1.indexOf('y'); i++) {
            a2 = a2.concat(String.valueOf(t1.charAt(i)));
        }
        for (int i = t1.indexOf('=') + 1; i < t1.length(); i++) {
            a3 = a3.concat(String.valueOf(t1.charAt(i)));
        }
        for (int i = 0; i < t2.indexOf('x'); i++) {
            b1 = b1.concat(String.valueOf(t2.charAt(i)));
        }
        for (int i = t2.indexOf('x') + 1; i < t2.indexOf('y'); i++) {
            b2 = b2.concat(String.valueOf(t2.charAt(i)));
        }
        for (int i = t2.indexOf('=') + 1; i < t2.length(); i++) {
            b3 = b3.concat(String.valueOf(t2.charAt(i)));
        }
        d = toInt(a1)*toInt(b2) - toInt(b1)*toInt(a2);
        d1 = toInt(a3)*toInt(b2) - toInt(b3)*toInt(a2);
        d2 = toInt(a1)*toInt(b3) - toInt(b1)*toInt(a3);
        System.out.print("x=");
        System.out.printf("%.01f", d1/d);
        System.out.println();
        System.out.print("y=");
        System.out.printf("%.01f", d2/d);
    }
    static int toInt(String s) {
        return Integer.parseInt(s);
    }
}