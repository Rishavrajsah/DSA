public class D80_array {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,6,6};
        System.out.println(SecondMax(arr));
        System.out.println(SecondMIn(arr));
    }
    // finding the second largest and second-smallest number in an array

    private static int SecondMax(int[] arr) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                sLargest =largest;
                largest =arr[i];
            } else if (arr[i]<largest && arr[i]>sLargest) {
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
    private static int SecondMIn(int[] arr) {
        int small = arr[0];
        int sSmall = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                sSmall =small;
                small =arr[i];
            } else if (arr[i]!=small && arr[i]<sSmall) {
                sSmall=arr[i];
            }
        }
        return sSmall;
    }
}
