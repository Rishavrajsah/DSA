public class D42Prime_number {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isprime(n));
        System.out.println(isprime1(n));
        System.out.println(isprime2(n));
    }

    private static boolean isprime(int n) {
        for(int i = 2; i<n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    private static boolean isprime1(int n) {
        for(int i = 2; i<=Math.sqrt(n);i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    private static boolean isprime2(int n) {
        int c =2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
