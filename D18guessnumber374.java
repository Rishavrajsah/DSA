// https://leetcode.com/problems/guess-number-higher-or-lower/
public class D18guessnumber374 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int pick = 5;
        System.out.println(binsearch(10,10));
    }
//    public int guessNumber(int n) {

    static int binsearch(int n,int pick){
        int start =1;
        int end =n;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid>pick){
                end = mid-1;
            } else if (mid<pick) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
