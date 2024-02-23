import java.util.Scanner;

public class D30Fibo_recusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans = fibo(n);
//        System.out.println(ans);
//        System.out.println(fiboformula(5));
//        for (int i=0;i<=50;i++){
//            System.out.println(fiboformula(i));
//        }
        System.out.println(fiboformula(5));
        System.out.println(fibo(5));

    }
    // fibonacci formula
//    static long fiboformula(int n){
//        return(int)((Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5));
//    }
    static long fiboformula(int n){
        return(int)(Math.pow(((1 + Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
    static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
