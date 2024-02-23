import java.util.Arrays;

public class D60BS_W_R {
    public static void main(String[] args) {
        int [] arr ={4,3,2,2,1};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
//    bubble sort with recursion
    static void sort(int[] arr,int i,int j){
        if (i== -1){
            return;
        }
        if (i>j){
            if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1]=temp;
            }
            sort(arr, i, j+1);
        }else {
            sort(arr, i-1, 0);
        }
    }
}
