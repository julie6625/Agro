package Search.Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FibonacciNumbers {
    static Scanner sc1 = new Scanner(System.in);


    public static long fib(int n){//遞迴
        if(n==1||n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    private static int f(int n){
        if (n == 0||n == 1) return n;
        else return f(n-1)+f(n-2);
    }

    public static void main(String[] args) {
        System.out.print("輸入費氏數列項數：");
        int j =sc1.nextInt();
        for (int i = 1;i<=j;i++) {
            System.out.print(fib(i)+"  ");
        }

        System.out.println();
        System.out.println("接下來用非遞迴");
        System.out.print("輸入費氏數列項數：");
        int k = sc1.nextInt();
        for (int i = 1;i<=k;i++) {
            System.out.print(f(i)+"  ");
        }
    }



}
