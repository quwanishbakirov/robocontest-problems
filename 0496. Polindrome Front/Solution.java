import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
            System.out.println(ispolindrome(n) ? n : prevPolindrome(n));
    }
    static long prevPolindrome(String n){
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
        if (Long.parseLong(n) == 10) return Long.parseLong(n) - 1;
        if (Long.parseLong(sb.reverse().toString()) < a) {
                return Long.parseLong(n) - (a - Long.parseLong(sb.toString()));
            } else {
                StringBuilder brev = new StringBuilder(String.valueOf(b - 1));
                return (b - 1) * (long) Math.pow(10, String.valueOf(b - 1).length()) + Long.parseLong(brev.reverse().toString());
            }
    }
    static boolean ispolindrome(String n){
        StringBuilder sb = new StringBuilder(n);
        return n.equals(sb.reverse().toString());
    }
}