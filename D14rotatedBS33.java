public class D14rotatedBS33 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr,target));

    }
    static public int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        // if you did not find pivot means array is not rotated
        if(pivot == -1){
            // just do normal binary search
            return binsearch(nums,target,0, nums.length-1);
        }
        // if pivot is found you have two sorted ascending arrays
        // there will be three cases to find answer
        // case 1
        if(nums[pivot]==target){
            return pivot;
        }
        //case 2
        if(target>=nums[0]){
            return binsearch(nums,target,0,pivot-1);
        }
        else{
            // case 3
            return binsearch(nums,target,pivot+1, nums.length-1);
        }

    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // those 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }else{
                start = mid +1;  // arr[start] < arr[mid]
            }
        }
        return -1;
    }
    static int binsearch(int[] arr , int target,int start , int end){
//        int start = 0;
//        int end = arr.length-1;
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
