import java.util.Arrays;

public class D23insertionsort {
    public static void main(String[] args) {
        int[] nums ={5,4,0,-3,-8};
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void insertionsort(int[] arr){
        for(int i =0;i< arr.length-1;i++){
            for(int j=i+1;j>0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }else{
                    break;
                }
            }
        }

    }
}
