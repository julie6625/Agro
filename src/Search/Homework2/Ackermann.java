package Search.Homework2;

import java.util.Scanner;
import java.util.Stack;

public class Ackermann {
    static Scanner sc1 = new Scanner(System.in);

    public static long ackermann(long m, long n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }


    public static int itFunc(int j, int k){
        Stack<Integer> s = new Stack<Integer>();
        s.add(j);
        while(!s.isEmpty()){
           j=s.pop();
            if(j==0) { k+=j+1; }
            else if(k==0)
            {
                k += 1;
                s.add(--j);
            }
            else{
                s.add(--j);
                s.add(++j);
                k--;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.print("m = ");
        long M = sc1.nextLong();
        System.out.print("n = ");
        long N = sc1.nextLong();
        System.out.println(ackermann(M, N));

        System.out.println("接下來使用非遞迴：");

        System.out.print("m = ");
        int j = sc1.nextInt();
        System.out.print("n = ");
        int k = sc1.nextInt();
        System.out.println(itFunc(j, k));
    }
}
