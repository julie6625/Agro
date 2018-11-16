package Search.Homework2;

import java.util.Scanner;

public class FactorialRecursive{

    static Scanner sc1 = new Scanner(System.in);
    int n = sc1.nextInt();

    public static void main(String args[]) {
        System.out.print("Input n:");
        long n = sc1.nextInt();
        System.out.printf("\n\n%d 的階乘 = %d\n", n, fac(n));
        System.out.println();
        System.out.println("接下來是非遞迴的階層計算");

        System.out.print("input k:");
        long k = sc1.nextInt();
        long total = 1;
        long sum =1;

        for(int i=1;i<k;i++) {
            total = total * i;
        }
        // calculate factorial
        sum= total * n;
        // display sum of factorial
        System.out.println("\n\n"+k+" 的階乘 = "+ total);
    }

    static long fac(long n){//遞迴


        if (n == 0) {
            return 1;
        }
        else {
            return (n * fac(n - 1));
        }
    }


}
