import java.util.Scanner;

public class D28patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        p1(n);
//        p2(n);
//        p3(n);
//        p4(n);
//        p5(n);
//        pattern5(n);
//        p6(n);
//        p7(n);
//        p8(n);
//        p9(n);
//        p10(n);
//        p11(n);
        p12(n);
    }
    static void p1(int n){
        System.out.println("pattern 1");
        for(int i =1;i<= n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        System.out.println("pattern 2");
        for(int i =1;i<= n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p3(int n){
        System.out.println("pattern 3");
        for(int i =1;i<= n;i++){
            for (int j=n;j>=i;j--){  // or for(int j=1;j<=n-i+1;j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p4(int n){
        System.out.println("pattern 4");
        for(int i =1;i<= n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void p5(int n){
        System.out.println("pattern 5");
        for(int i =1;i<= n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =1;i<= n;i++){
            for (int j=n-1;j>=i;j--){  // or for(int j=1;j<=n-i+1;j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        System.out.println("pattern 5");
        for(int i =1;i<2*n;i++){
            int totalcolinrow = i >n ? 2*n -i :i;
            for(int j=1;j<=totalcolinrow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *
    static void p6(int n){
        System.out.println("pattern 6");
        for(int row =1;row<2*n;row++){
            int totalcolinrow = row >n ? 2*n -row :row;
            // for spaces
            int noofspace = n-totalcolinrow;
            for(int space =1;space<=noofspace;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcolinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//                 *
//                ***
//               *****
//              *******
//             *********
    static void p7(int n) {
        System.out.println("pattern 7");
        for (int row = 1; row <= n; row++) {
            // for spaces
            int noofspace = n - row;
            for (int space = 1; space <= noofspace; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=(2*row-1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//                            1
//                          2 1 2
//                        3 2 1 2 3
//                      4 3 2 1 2 3 4
//                    5 4 3 2 1 2 3 4 5
    static void p8(int n) {
        System.out.println("pattern 8");
        for (int row = 1; row <= n; row++) {
            // for spaces
            int noofspace = n - row;
            for (int space = 1; space <= noofspace; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
//                       1
//                      212
//                     32123
//                    4321234
//                     32123
//                      212
//                       1
    static void p9(int n){
        for(int row = 1;row<2*n;row++){
            int c = row>n ?2*n-row:row;
            for(int space =1;space<=n-c;space++){
                System.out.print("  ");
            }
            for (int col = c; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
//            1 1 1 1 1 1 1
//            1 2 2 2 2 2 1
//            1 2 3 3 3 2 1
//            1 2 3 4 3 2 1
//            1 2 3 3 3 2 1
//            1 2 2 2 2 2 1
//            1 1 1 1 1 1 1
    static void p10(int n){
        for (int row = 1;row<2*n;row++){
            for (int col = 1;col<2*n;col++){
                int a = Math.min(col,2*n-col);
                int b = Math.min(row,2*n-row);
                int indexat = Math.min(a,b);
                System.out.print((indexat)+" ");

            }
            System.out.println();
        }
    }
//            4 4 4 4 4 4 4
//            4 3 3 3 3 3 4
//            4 3 2 2 2 3 4
//            4 3 2 1 2 3 4
//            4 3 2 2 2 3 4
//            4 3 3 3 3 3 4
//            4 4 4 4 4 4 4
    static void p11(int n){
        for (int row = 1;row<2*n;row++){
            for (int col = 1;col<2*n;col++){
                int a = Math.min(col,2*n-col);
                int b = Math.min(row,2*n-row);
                int indexat = Math.min(a,b);
                System.out.print((n-indexat+1)+" ");

            }
            System.out.println();
        }
    }
// 1                  * * * * *
// 2                   * * * *
// 3                    * * *
//  4                    * *
// 5                      *
// 6                      *
// 7                     * *
// 8                    * * *
// 9                   * * * *
//10                  * * * * *
    static void p12(int n){
        for (int row =1;row<=2*n;row++){
            int colat = row>n ? row-n : n-row+1;
            for (int space = 1;space<=n-colat;space++){
                System.out.print(" ");
            }
            for (int col = 1;col<=colat;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
