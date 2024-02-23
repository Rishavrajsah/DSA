import java.util.Arrays;

// FIRST AND LAST OCCURRENCE - FACEBOOK QUESTION

public class D09leetcode34 {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int a = firstoccurance(num,target);
        int b = secondoccurance(num,target);
        int[] ans = {a,b};
        System.out.println(Arrays.toString(ans));

    }
    static public int firstoccurance(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if (target<nums[mid]){
                end = mid -1;
            } else if (target>nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                end = mid-1;

            }
        }
        return ans;
    }
    static int secondoccurance(int[] nums , int target){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if (target<nums[mid]){
                end = mid -1;
            } else if (target>nums[mid]) {
                start = mid + 1;
            }else {
                ans = mid;
                start = mid+1;

            }
        }
        return ans;
    }
}
