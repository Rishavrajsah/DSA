import java.util.Scanner;

public class D03linear_search {
    void input(int [] arr){
        System.out.println("enter no of elements in list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter list elements:");
        for(int j = 0;j<n;j++){
            arr[j] = sc.nextInt();
        }

    }
    int linearsearch(int [] arr , int no){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0;i< arr.length;i++){
            int element = arr[i];
            if (element ==no){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] R = new int[20];
        D03linear_search a1 = new D03linear_search();
        a1.input(R);
        System.out.println("enter number to search:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = a1.linearsearch(R,x);
        if(ans==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("element found at position:" + (ans + 1) );
        }

    }

}
