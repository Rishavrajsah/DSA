import java.util.ArrayList;

public class D46Factors {
    public static void main(String[] args) {
        int n = 36;
        factor(n);
        factor2(n);
        factor3(n);
    }
//     O(N)
    private static void factor(int n) {
        for (int i = 1; i <=n ; i++) {
            if (n%i == 0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }
    // O(Sqrt(n))
    private static void factor2(int n) {
        for (int i = 1; i*i<=n ; i++) {
            if (n%i == 0){
                if (n/i == i){
                    System.out.print(i +" ");
                }else {
                    System.out.print(i+ " "+ n/i+ " ");
                }
            }
        }
        System.out.println();
    }
    // for sorted answer
    // here both space and time complexity will be O(sqrt(n))
    private static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i<=n ; i++) {
            if (n%i == 0){
                if (n/i == i){
                    System.out.print(i +" ");
                }else {
                    System.out.print(i+ " ");
                    list.add( n/i);
                }
            }
        }
        for (int i = list.size()-1; i>=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
