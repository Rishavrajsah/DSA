import java.util.Scanner;
// in order agnostic binary search we don't know whether the list is in ascending order or in descending
// order, so we first check then implement

public class D06orderAgnBS {
    static void input(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sorted array:");
        for(int i = 0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
    }
    static int orderaugBS(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<=end){
            // find middle
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target<arr[mid]){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
            }else{
                if (target>arr[mid]){
                    end = mid -1;
                } else{
                    start = mid + 1;
                }
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
        int ans = orderaugBS(arr,tar);
        System.out.println(ans);
    }
}
