package Search;
import java.util.*;
public class Binary {
    //二元搜尋,傳入的數序需先排序,由小至大
    public static int BinarySearch(int[] list,int item)
    {
        //初始左右二邊
        int left = 0 ;
        int right = list.length;

        //左邊的索引位置小於右邊索引的位置
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(list[mid]==item)
                return mid;
            else{
                //所查詢值比中間值小,故值會在中間的左邊數列
                if(list[mid]>item){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }
        }
        return -1;//找不到時
    }
    public static void main(String args[])
    {
        //輸入物件
        Scanner in = new Scanner(System.in);

        //二元搜尋範例
        int[] list2 = {2,4,6,8,10,12,13,14,15,16};

        System.out.println("原始數列:");
        for(int i = 0 ; i <list2.length ; i ++){
            System.out.print(list2[i]+" ");
        }

        System.out.println("\r\n請輸入要查詢數:");
        int searchkey2 = in.nextInt();

        int ans2 =  BinarySearch(list2,searchkey2);
        if(ans2>-1){
            System.out.println("找到資料!索引位置在:"+ans2);
        }
        else
            System.out.println("找不到資料!");
    }
}
