public class D45NewtonSQRT {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sqr(n));
        System.out.println(sqr2(n));
    }

    private static double sqr(double n) {
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x+(n/x));
            if(Math.abs (root-x) < 1){
                break;
            }
            x = root;
        }
        return root;
    }
    static double sqr2(int n){
        double t ;
        double Sqrt = n/2;
        do {
            t = Sqrt;
            Sqrt = (t+(n/t))/2;
        }while (t-Sqrt !=0);
        return Sqrt;

    }
}
