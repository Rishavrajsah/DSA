import java.util.Arrays;

public class D78_REVERSE_Array {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        reV(arr);
        System.out.println(Arrays.toString(arr));
    }
    // reverse a array
    static void reV(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void reV2(int[] arr,int a){
        if(a>= arr.length/2){
            return;
        }
            int temp = arr[a];
            arr[a]=arr[arr.length-a-1];
            arr[arr.length-a-1]=temp;
            reV2(arr,++a);
    }
}
