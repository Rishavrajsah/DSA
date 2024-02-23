import java.util.Arrays;

public class D19sortrowcol2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        int target = 37;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(Arrays.toString(binsearch(arr,target)));
    }
    // this is normal search we have do some efficient method for sorted arrays
    static int[] search(int[][] arr,int target){
        for(int row = 0;row< arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // this is efficient method to solve
    static int[] binsearch(int[][] arr,int target){
        int row =0;
        int col = arr[row].length-1;
        while (row< arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            } else if (arr[row][col]>target) {
                col--;
            }else{
                row++;//arr[row][col]<target
            }
        }
        return new int[]{-1,-1};
    }
}
