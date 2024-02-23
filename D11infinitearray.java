public class D11infinitearray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,10,12,14,16,18,20,22,23,26,28};
        int target = 26;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr , int target){
        //first start with the box of size 2
        int start = 0;
        int end = 1;
        //condition of target to lie in the range
        while(target>arr[end]){
            int temp = end +1; //this will be my new start
            end = end+(end-start+1)*2;
            start=temp;
        }
        return binsearch(arr,target,start,end);
    }
    static int binsearch(int[] arr , int target,int start,int end){
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
