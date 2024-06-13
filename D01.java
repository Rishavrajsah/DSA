import java.util.Arrays;
import java.util.Scanner;
public class D01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        //input
        for(int row = 0 ; row< arr.length ;row++ ){
            for(int col = 0 ; col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //output m1
        for(int row = 0 ; row< arr.length ;row++ ){
            for(int col = 0 ; col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
        //output m2
        for(int row = 0 ; row< arr.length ;row++ ){
            System.out.println(Arrays.toString(arr[row]));
        }
        //output m3
        System.out.println("output through for each loop");
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        // some changes has made

    }
}
