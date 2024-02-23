import java.util.Scanner;

public class D32Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddeven(n);

    }
    // new way to find if number is odd or even
    static void oddeven(int n){
        if((n & 1) == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }
}
