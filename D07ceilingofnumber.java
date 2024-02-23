public class D07ceilingofnumber {
    public static void main(String[] args) {
        int[] arr = {11,12,43,46,58,63,74,88};
        int target =45;
        int ans = ceiling(arr,target);
        System.out.println(ans);
        int ans2 = floor(arr,target);
        System.out.println(ans2);

    }
    // for finding minimum number that is >= target "ceiling"
    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];   // this is the most important step !!!!!!
    }

    // for finding minimum number that is <= target  "floor"
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];   // this is the most important step !!!!!!
    }
}
