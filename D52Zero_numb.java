public class D52Zero_numb {
    // to find the number of zero's
    public static void main(String[] args) {
        zero(4309020);
        System.out.println(count);
        System.out.println(zero2(102040,0));

    }
    // way 1
    static  int count = 0;
    static void zero(int n){

        if (n==0){
            return;
        }
        if (n%10 == 0){
            count += 1;
        }
        zero(n/10);
    }
    static int zero2(int n, int count){
        if (n%10==n){
            return count;
        }
        if (n%10==0){
            return zero2(n/10,count+1);
        }else {
            return zero2(n/10,count);
        }
    }
}
