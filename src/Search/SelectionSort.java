package Search;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 6, 2, 10, 2, 1 };
        System.out.println("原始陣列:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        System.out.println();
        selectSort(arr);
        System.out.println("排序後陣列:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // 用來紀錄最小值的索引位置，默認為i
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j; // 巡過 i+1~length 的值，找到其中最小值的位置
                    }
                }
                // 交換當前索引 i 和最小值索引 minIndex 兩處的值
                    if (i != minIndex) {
                        int temp = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temp;
                    }
                    // 執行玩一次循環，當前索引 i 處的值為最小值，直到循環结束即可完成排序
        }
    }
}
