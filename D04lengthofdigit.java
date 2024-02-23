import java.util.Scanner;

public class D04lengthofdigit {
    static int len(int number){
        int count = 0;
        while (number != 0){
            number = number/10;
            count = count +1;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            int count = len(arr[i]);
           // System.out.println(count);
            if(count % 2 ==0){
                sum = sum+1;
            }
        }
        System.out.println(sum);



    }
}
// my leetcode solution
//class Solution {
//    public int findNumbers(int[] nums) {
//        int count = 0;
//        for(int i = 0; i<nums.length;i++){
//            int con = 0;
//            while(nums[i]!=0){
//                nums[i]=nums[i]/10;
//                con = con+1;
//            }
//            if(con%2==0){
//                count = count +1;
//            }
//        }
//        return count;
//
//    }
//}
