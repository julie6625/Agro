package Search.Homework2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("輸入兩數:");
        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("GCD: " + gcd(m, n));

        System.out.println("接下來用非遞迴：");
        System.out.println("輸入兩數:");
        System.out.print("k = ");
        int k = scanner.nextInt();
        System.out.print("j = ");
        int j = scanner.nextInt();
        System.out.println("GCD: " + gcd2(k, j));
    }

    private static int gcd(int m, int n) {//遞迴
        if(n == 0)
            return m;
        else
            return gcd(n, m % n);
    }

    private static int gcd2(int k, int j) {
        int r = 0;

        while(j != 0) {
            r = k % j;
            k = j;
            j = r;
        }

        return k;
    }
}
