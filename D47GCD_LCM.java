public class D47GCD_LCM {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        System.out.println(gcd( a, b));
        System.out.println(lcm( 7, 2));
    }

    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    // Euclidean algorithm
    private static int gcd(int a, int b) {
        if (a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
