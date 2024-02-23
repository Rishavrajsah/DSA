import java.util.ArrayList;

public class D55LS_Rec {
    // This is example of linear search with recursion
    public static void main(String[] args) {
        int []arr = {2,4,1,1,5,6,74};
        int target = 74;
        System.out.println(ispresent(arr,target,0));
        System.out.println(ispresent2(arr,target,0));
        System.out.println(findindex(arr,target,0));
        System.out.println(findindexfromlast(arr,target, arr.length-1));
        findallindex(arr,1,0);
        System.out.println(list);
    }

    private static boolean ispresent(int[] arr, int target, int i) {
        if(arr[i]== target){
            return true;
        }else if (i== arr.length-1){
            return false;
        }
        else {
            return ispresent(arr,target,i+1);
        }
    }
    private static boolean ispresent2(int[] arr, int target, int i) {
         if (i== arr.length){
            return false;
        }
        return arr[i]==target || ispresent(arr,target,i+1);
    }
    private static int findindex(int[] arr, int target, int i) {
        if(arr[i]== target){
            return i;
        }else if (i== arr.length-1){
            return -1;
        }
        else {
            return findindex(arr,target,i+1);
        }
    }
    private static int findindexfromlast(int[] arr, int target, int i) {
        if(i == -1){
            return -1;
        }else if (arr[i] == target){
            return i;
        }
        else {
            return findindexfromlast(arr,target,i-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    private static void findallindex(int[] arr, int target, int i) {
        if(arr[i]== target){
            list.add(i);
        }
        if (i== arr.length-1){
            return;
        }
        findallindex(arr,target,i+1);
    }
}
