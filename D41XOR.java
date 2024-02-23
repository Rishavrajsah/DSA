public class D41XOR {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(xor1(n));
        int b = 3;
        System.out.println(xor1(n)^xor1(b-1));
    }

    private static int xor1(int a) {
        if(a%4 == 0)
            return a;
        if (a%4 == 1) {
            return 1;
        }
        if (a%4 == 2) {
            return a+1;
        }
        if (a%4 ==3){
            return 0;
            }
        return 0;
    }
}
