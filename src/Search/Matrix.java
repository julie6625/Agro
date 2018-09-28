package Search;

public class Matrix {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] a={{1,2},{3,4},{5,6}};//自訂矩陣
        int[][] b={{1,2,3},{4,5,6}};//自訂矩陣
        printMatrix(a,b);
    }
    static void printMatrix(int[][] a,int[][] b){
        int c[][] = new int[a.length][b[0].length];

        int x,i,j;

        System.out.println("A陣列：");
        for (int s = 0; s < a.length; s++){
            for (int d = 0; d < a[s].length; d++){
                System.out.print(a[s][d] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("B陣列：");
        for (int s = 0; s < b.length; s++){
            for (int d = 0; d < b[s].length; d++){
                System.out.print(b[s][d] + " ");
            }
            System.out.println();
        }


        for(i = 0;i<a.length ;i++){
            for(j = 0;j<b[0].length;j++){
                int temp = 0;
                for(x = 0;x<b.length;x++){
                    temp+=a[i][x]*b[x][j];
                }
                c[i][j] = temp;
            }
        }
        System.out.println("矩陣相乘結果為");
        for(int m = 0;m<a.length;m++){
            for(int n = 0;n<b[0].length;n++){
                System.out.print(c[m][n]+"\t");
            }
            System.out.println();
        }
    }
}
