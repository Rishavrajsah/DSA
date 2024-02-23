import java.util.Arrays;
// cyclic sort is in range from 1 to n

public class D24cyclicsort {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4};
        cyclicsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclicsort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
              int temp = arr[i];
              arr[i]= arr[correct];
              arr[correct] =temp;
            }else {
                i++;
            }
        }
    }
}
