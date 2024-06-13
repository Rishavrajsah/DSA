import java.util.Arrays;

public class D61SS_W_R {
    public static void main(String[] args) {
        int [] arr ={4,3,2,1};
        sort(arr, arr.length,0,0 );
        System.out.println(Arrays.toString(arr));
    }
    //    Selection sort with recursion
    static void sort(int[]arr,int i,int j,int max){
        if(i== 0){
            return;
        }
        if (i>j){
            if (arr[max]<arr[j]){
                sort(arr, i, j+1, j);
            }else {
                sort(arr, i, j+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max]=arr[i-1];
            arr[i-1] = temp;
            sort(arr,i-1,0,0);
        }
    }
}
// just checking
