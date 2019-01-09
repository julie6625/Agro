package Search.Homework3;

class QuickSort
{
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // 較小的index元素
        for (int j=low; j<high; j++)
        {
            //如果當前元素小於或等於最大值(pivot)
            if (arr[j] <= pivot)
            {
                i++;

                // 交換 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 交換 arr[i+1] 和 arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /*arr[] --> 數列,
    low --> 起始index,
    high --> 末尾index */
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    //主程式
    public static void main(String args[])
    {
        int arr[] = {19, 7, 2, 9, 1, 5};
        int n = arr.length;
        System.out.println("原始資料為:");
        printArray(arr);
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("排序後結果為:");
        printArray(arr);
    }
}
