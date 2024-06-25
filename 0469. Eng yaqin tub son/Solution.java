import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int l = 0, r = 0;

        if (isPrime(n)) {
            System.out.println(n);
        } else {
            for (int i = n - 1; i > 1; i--) {
                if (isPrime(i)) {
                    l = i;
                    break;
                }
            }
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    r = i;
                    break;
                }
            }

            if (n - l == r - n) {
                System.out.println(l + " " + r);
            } else if (n - l > r - n) {
                System.out.println(r);
            } else {
                System.out.println(l);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}