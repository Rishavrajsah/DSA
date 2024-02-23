public class D31BS_recursion {
    static int binsearch(int[] arr , int target , int start , int end ){
//         start = 0;
//         end = arr.length-1;

            // find middle
            int mid = start + (end-start)/2;
            if(start>end){
                return -1;
            }
            else if (target<arr[mid]){
                return binsearch(arr , target ,start,mid-1);
            } else if (target>arr[mid]) {
               return binsearch(arr, target, mid+1, end);
            }else {
                return mid;
            }

        //return -1;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,4,5,6,7,8};
        int target = 2;
        int ans = binsearch(nums,target,0, nums.length-1);
        System.out.println(ans);
    }
}
