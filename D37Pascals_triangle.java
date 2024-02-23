public class D37Pascals_triangle {
    public static void main(String[] args) {
        int nth = 4;
        int ans1 = 2^(nth-1);  // this is wrong because this ^ means xor of a number
        int ans3 = (int)Math.pow(2,nth-1);
        int ans2 = 1<<(nth-1);  // this is important
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
