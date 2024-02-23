public class D44Sqrt {
    public static void main(String[] args) {
        int n= 40;
        System.out.println(sqrt1(n));
        int p =3 ;
        System.out.println(sqrt2(n,p));
    }
// let's find square root of perfect square of an number using binary search
    private static int sqrt1(int n) {
        int start = 1;
        int end = n;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid>n){
                end = mid-1;
            } else if (mid*mid<n) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return 0;
    }
    private static double sqrt2(int n , int p) {
        int start = 1;
        int end = n;
        double root = 0.0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid>n){
                end = mid-1;
            } else if (mid*mid<n) {
                start=mid+1;
            }else {
                root= mid;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<=n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
