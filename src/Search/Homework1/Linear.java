package Search.Homework1;
import java.util.*;
public class Linear {
    //循序搜尋

    public static int LinearSearch(int[] list,int item){
        for(int i = 0 ; i < list.length;i++){
            if(list[i]==item)
            return i;//找到時回傳位置
        }
        return -1;//找不到時
    }
    public static void main(String args[]){
        //輸入物件
        Scanner in = new Scanner(System.in);

        //循序搜尋範例
        int[] list = {2,4,5,1,3,4,5,6,7,8};

        System.out.println("原始數列:");
        for(int i = 0 ; i <list.length ; i ++){
            System.out.print(list[i]+" ");
        }

        System.out.println("\r\n請輸入要查詢數:");
        int searchkey = in.nextInt();

        int ans =  LinearSearch(list,searchkey);
        if(ans>-1){
                    System.out.println("找到資料!索引位置在:"+ans);
        }
        else
            System.out.println("找不到資料!");


    }

}
