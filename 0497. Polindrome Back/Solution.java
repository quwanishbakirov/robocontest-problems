import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        System.out.println(ispolindrome(n) ? n : nextPolindrome(n));
    }
    static String nextPolindrome(String n){
        int len = n.length();
        long a;
        long b;
        if(len % 2 == 1){
            b = Long.parseLong(n.substring(0, len / 2 + 1));
        } else {
            b = Long.parseLong(n.substring(0, len / 2));
        }
        a = Long.parseLong(n.substring(len / 2, len));

        StringBuilder sb = new StringBuilder(String.valueOf(b));

        if (Long.parseLong(sb.reverse().toString()) > a){
            if (len % 2 == 0) {
                return sb.reverse().substring(0, sb.length()) + sb.reverse();
            } else {
                return sb.reverse().substring(0, sb.length() - 1) + sb.reverse();
            }
        } else {
            StringBuilder b1 = new StringBuilder(String.valueOf(b + 1));
            return b1.substring(0, b1.length()) + b1.reverse();
        }

    }

    static boolean ispolindrome(String n){
        StringBuilder sb = new StringBuilder(n);
        return n.equals(sb.reverse().toString());
    }
}