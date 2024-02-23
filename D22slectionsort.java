import java.util.Arrays;

public class D22slectionsort {
    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,4,3,2,1};
        slection(num);
        System.out.println(Arrays.toString(num));

    }
    static void slection(int[] arr){
        for(int i =0;i< arr.length;i++){
            int sum = 0;
            for(int j=0;j< arr.length-i;j++){
                if (arr[j]>arr[sum]){
                    sum = j;
                }
                int temp = arr[sum];
                arr[sum] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
//           int temp = arr[sum];
//            arr[sum] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;

        }
    }
}
