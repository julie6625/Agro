package Search.Homework2;

import java.util.Scanner;

public class combination {
    static Scanner sc1 = new Scanner(System.in);

    private static int nCr(int n, int r) {
        if (r == 0 || r == n) return 1;  // stop recursion, we know the answer.
        return nCr(n-1, r-1) + nCr(n-1, r); // the answer is made of the sum of two "easier" ones
    }

    private static int nCr2(int j , int k){
        if (k == 0 || k == j) return 1;
        return fac(j-1)/(fac(k)*fac(j-1-k))+
                fac(j-1)/(fac(k-1)*fac((j-1)-(k-1)));
    }

    public static int fac(int n){


        if (n == 0) {
            return 1;
        }
        else {
            return (n * fac(n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = sc1.nextInt();
        System.out.print("r = ");
        int r = sc1.nextInt();

        System.out.println("C("+n+","+r+") = "+nCr(n,r));

        System.out.println("\n\n接下來使用非遞迴：");

        System.out.print("n = ");
        int j = sc1.nextInt();
        System.out.print("r = ");
        int k = sc1.nextInt();

        System.out.println("C("+j+","+k+") = "+nCr2(j,k));
    }
}
