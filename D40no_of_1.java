public class D40no_of_1 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(met1(n));
        System.out.println(met2(n));
    }

    private static int met1(int n) {
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return  count;
    }
    private static int met2(int n) {
        int count = 0;
        while(n>0){
            n = n-(n&(-n));
            count++;
        }
        return count;
    }
}
