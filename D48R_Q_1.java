public class D48R_Q_1 {
    public static void main(String[] args) {
        int n = 5;
        numsboth(n);

    }
    // n ton 1

    private static void nums(int n) {
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        nums(n-1);
    }
    // 1 to n
    private static void nums2(int n) {
        if (n==1){
            System.out.println(1);
            return;
        }
        nums2(n-1);
        System.out.println(n);
    }
    //both
    private static void numsboth(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        numsboth(n-1);
        System.out.println(n);
    }

}
