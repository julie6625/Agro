package Search;
import java.util.*;
public class factorial {
    public static void main(String[] args){
        System.out.println("請輸入要階乘的數字:");
        Scanner scanner = new Scanner(System.in);
        long sc1 = scanner.nextLong();
        long n = sc1*sc1;

        System.out.println(sc1+"\t的階乘為:\t"+n );

    }
}
