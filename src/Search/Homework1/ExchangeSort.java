package Search.Homework1;

public class ExchangeSort {
    public static void main(String args[]) {

        int[] array = {1,10,2,9,3,8,4,7,5,6}; //設定序列
        System.out.print("Start : " );
        for(int x = 0; x < array.length; x++) {
            System.out.print( " " + array[x]);
        }
        System.out.println(" ");

        int temp;
        for (int i=0; i < array.length-1; i++) {
            for (int j = i+1; j<array.length; j++) {
                if(array[ i ] < array[ j ]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            System.out.print("loop " + i + ": ");
            for(int x = 0; x < array.length; x++) {
                System.out.print( " " + array[x]);
            }
            System.out.println(" ");
        }
    }
}
