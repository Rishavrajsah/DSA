public class D17splitArray {
    public static void main(String[] args) {
        int[] num = {7, 2, 5, 10, 8};
        System.out.println(splitArray(num,2));
    }
    static public int splitArray(int[] nums,int k) {
        int start = 0;
        int end = 0;
        for(int i=0;i< nums.length;i++){
            start = Math.max(start,nums[i]);
            end +=nums[i];
        }
        // binary search
        while (start<end){
            // try for middle as potential answer
            int mid = start+(end-start)/2;
            // calculate how many pieces pieces you can divide this is with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum+num>mid){
                    // you cannot add this in this subarray , make new one
                    // say you add this num is new arrays then sum = num
                    sum = num;
                    pieces++;
                }else {
                    sum = sum+num;
                }
            }if (pieces>k){
                start=mid+1;
            }else {
                end = mid;
            }
        }
        return end;
    }
}
