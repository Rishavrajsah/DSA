public class D38Power_of_2 {
    public static void main(String[] args) {
        int n = 1024;
        int count =0;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            if(last == 1){
                count += 1;
            }
        }
        if(count == 1){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        ispowerof2(n);
    }
    // some most efficient way to do this
    static void ispowerof2(int n){
        if((n & (n-1)) == 0){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}
