import java.lang.reflect.Array;
import java.util.Arrays;

public class D03searchin2Darray {
    public static void main(String[] args) {
        int [][] arr = {
                {5,6,87,34},
                {23,45,34,56,24},
                {76,100,65,78}
        };
        int target = 76;
        int []ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(maxm(arr));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(min(arr));

       // System.out.println(Math.log(12345));
    }
    static int[] search(int[][] arr, int target){
        for(int row = 0;row< arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if (arr[row][col] == target){
                    return new int[]{row+1 , col+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // finding maximum value element
    static  int max(int [][] arr){
        int max = 0;
        for (int[] ints : arr){
            for (int element : ints){
                if (element>max){
                    max = element;
                }
            }
        }
        return max;
    }
    // method 2
    static int maxm(int[][] arr){
        int maxm = 0;
        for(int row = 0;row< arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if (arr[row][col] > maxm){
                    maxm = arr[row][col];
                }
            }
        }
        return maxm;
    }
    // finding minimum value in 2d array
    static int min(int [][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] ints : arr){
            for (int element : ints){
                if(element<min){
                    min = element;
                }
            }
        }
        return min;
    }
}
