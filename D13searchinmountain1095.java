public class D13searchinmountain1095 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,2,1};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static  int search(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderaugBS(arr,target,0,peak); // this will search in left
        if(firsttry!=-1){
            return firsttry;
        }
        return orderaugBS(arr,target,peak,arr.length-1);
    }
    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
    static int orderaugBS(int[] arr , int target,int start,int end){
//        int start = 0;
//        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target<arr[mid]){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }else{
                if (target>arr[mid]){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
