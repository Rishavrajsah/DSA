import java.util.Arrays;

public class D02ques {
    // swap two elements of an array
    static void swap(int[]arr , int a , int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    // max element in an array
    static int max(int [] arr){
      int maxval = arr[0];
      for(int i = 0;i< arr.length;i++){
          if(arr[i]>maxval){
              maxval = arr[i];
          }
      }
      return maxval;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8};
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));
        System.out.println("maximum value is:"+ max(arr));
    }
}
