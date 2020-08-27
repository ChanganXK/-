import java.util.Scanner;
public class Solution1 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("目标值");
        int target=sc.nextInt();
        System.out.println("输入数组的阶数");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("输入每个元素");
        int[][]arry=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arry[i][j]=sc.nextInt();


            }

        }
        Find(arry,target);

    }
    public static void Find(int[][] arr,int target) {
        int flag;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("找到target");
                    break;

                }



            }
        }



    }
}
