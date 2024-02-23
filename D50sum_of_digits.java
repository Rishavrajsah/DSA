public class D50sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sum(342));
        System.out.println(product(342));
    }
// sum of digits
    private static int sum(int n) {
        if (n==0){
            return 0;
        }
        return sum(n/10)+n%10;
    }
    // product of a number
    private static int product(int n) {
        if (n%10 == n){
            return n;
        }
        return product(n/10)*(n%10);
    }
}
