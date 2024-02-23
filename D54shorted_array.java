public class D54shorted_array{
    public static void main(String[] args) {
        int []arr = {0,1,2,4,9,9,10};
        System.out.println(issort(arr));
        System.out.println(issort2(arr));
    }

    private static boolean issort2(int[] arr) {
        return helper3(arr , 0);
    }

    private static boolean helper3(int[] arr, int i) {
        if (i == arr.length-1){
            return true;
        }
        return arr[i] <= arr[i + 1] && helper3(arr, i + 1);
    }

    private static boolean issort(int[] arr) {
        int i= 0;
        while (i< arr.length-1){
            if (arr[i]<=arr[i+1]){
                i++;
            }else {
                return false;
            }
        }
        return true;
    }
}
