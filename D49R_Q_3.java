public class D49R_Q_3 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(sum(5));
    }
// factorial of a number
    private static int factorial(int n) {
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    // sum of n to 1
    private static int sum(int n) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
