package Search.Homework2;

import java.util.Arrays;


public class MInMax {
    public static void main(String[] args) {
        int[] array = {1, 3, 67, 34, 23, 89, 56, 34, 21};
        int max = array[0];//默認第一個最大
        int min = array[0];//默認第一個最小
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];//如果有比max大的數就讓max紀錄下大的數
            }
            if (array[i] < min) {
                min = array[i];//如果有比min大的數就讓min紀錄下大的數
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("接下來用非遞迴表示");

        int[] tab = {12, 1, 21, 8};
        int min1= Arrays.stream(tab).min().getAsInt();
        int max2= Arrays.stream(tab).max().getAsInt();
        System.out.println("max = " + max2);
        System.out.println("min = " + min1);
    }
}
