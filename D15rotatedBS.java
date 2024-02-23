public class D15rotatedBS {
    // rotated binary search in array with duplicate values
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        int target = 9;
        System.out.println(search(arr,target));
        System.out.println(findpivotwithduplicates(arr));

    }
    static public int search(int[] nums, int target) {
        int pivot = findpivotwithduplicates(nums);
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
    static int findpivotwithduplicates(int[] arr){
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
//            if(arr[start]>arr[mid]){
//                end = mid-1;
//            }else{
//                start = mid +1;  // arr[start] < arr[mid]
//            }
            //if element at middle ,start , end are same then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //note: what if these elements at start and end were pivots ?
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
                // left side sorted so pivot should be in right
            } else if (arr[start]<arr[mid] || (arr[start]==arr[mid]&&arr[mid]>arr[end])) {
                start=mid+1;
            }else {
                end = mid-1;
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
