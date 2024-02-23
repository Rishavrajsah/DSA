public class D51R_Q_7 {
    public static void main(String[] args) {
        reverse1(56435);
        System.out.println();
        reverse2(12345);
        System.out.println(sum);
        System.out.println(reverse3(5678));
        System.out.println(palindrome(1234321));
    }
    //way 1 my way

    private static void reverse1(int n) {
        if (n==0){
            return;
        }
        System.out.print(n%10);
        reverse1(n/10);

    }
    // way 2
     static int sum =0;
    private static void reverse2(int n) {

        if (n==0){
            return;
        }
        int remainder = n%10;
        sum = sum*10 + remainder;
        reverse2(n/10);
    }
    // way 3
    static int reverse3(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palindrome(int n){
        return n==reverse3(n);
    }
}
