import java.util.Scanner;

public class D05binarysearch {
    static void input(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sorted array:");
        for(int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    static int binsearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr);
        System.out.println(arr[3]);
        System.out.println("enter element to search:");
        int tar = sc.nextInt();
        int ans = binsearch(arr,tar);
        System.out.println(ans);
    }
}
