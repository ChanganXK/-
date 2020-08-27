public class Solution {
    public static void main(String[] args){

        System.out.println(Sum_Solution(20)+Sum_Solution(20));
    }

        public static int Sum_Solution(int n) {

            int sum = n;
            int res =0;
            boolean flg = (n>0) && ((sum += Sum_Solution(n-1)) > 0);
            res=sum;
            return sum;


        }



    }
