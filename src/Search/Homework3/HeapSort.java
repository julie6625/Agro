package Search.Homework3;

public class HeapSort
{


    public void sort(int arr[])
    {
        int n = arr.length;

        // 建立堆積樹
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            // 移動目標節點到樹根
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    // 開始堆積排序 n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // 設定最大值為樹根
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // 如果左節點大於樹根
        if (l < n && arr[l] > arr[largest])
            largest = l;

        //如果右節點大於樹根
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // 如果最大值不是樹根
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // 主程式
    public static void main(String args[])
    {
        int arr[] = {23, 3, 13, 5, 6, 7};
        int n = arr.length;
        System.out.println("原始資料為:");
        printArray(arr);
        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("排序後結果為:");
        printArray(arr);
    }
}

