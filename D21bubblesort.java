import java.util.Arrays;

public class D21bubblesort {
    public static void main(String[] args) {
        int[] num = {52,72,401,719};
        bubblesort(num);
        System.out.println(Arrays.toString(num));

    }
    static void bubblesort(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i=0;i< arr.length;i++){
            swapped = false;
            // for each step max item will come at last index
            for(int j=1;j< arr.length-i;j++){
                // swap if item is smaller then the previous item
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped=true; // means swap happened
                }
            }
            // if you did not swap for a particular value of i means array is sorted hence stop
            if(! swapped){ // !false = true
                break;
            }

        }
    }
}
