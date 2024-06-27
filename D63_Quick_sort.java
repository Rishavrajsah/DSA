import java.util.Arrays;

public class D63_Quick_sort {
    public static void main(String[] args) {
        int[] arr = {8,4,4,7,4,3};
//        sort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
        //inbuilt sort in java
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] nums,int low ,int high){
        if (low>=high){
            return;
        }
        int s  =low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];
        while(s<=e){
            // also a reason why if its already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now pivot is at correct index sort LHS and RHS of pivot
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
