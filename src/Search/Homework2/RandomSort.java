package Search.Homework2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomSort {
    public static void randomsort(String[] array) {
    for(int i=0;i<array.length;i++) {
        int s=(int)(Math.random()*(array.length));
        String temp=array[s];
        array[s]=array[i];
        array[i]=temp;
    }
}

    public static void main(String[] args) {
        List<Integer> solution = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            solution.add(i);
        }
        Collections.shuffle(solution);
        System.out.println(solution);

        System.out.println();
        System.out.println("接下來使用非遞迴");

        String[] array= {"5", "4", "9", "11","13"};
        RandomSort.randomsort(array);
        System.out.print(" ");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.print("");
    }
}
