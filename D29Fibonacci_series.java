import java.util.Scanner;
// to find the nth position in the Fibonacci series without recursion
public class D29Fibonacci_series {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(a);
//        System.out.println(b);
        for (int i=2;i<=n;i++){
            c = a +b;
            a =b;
            b =c;

        }
        System.out.println(c);
    }
}
