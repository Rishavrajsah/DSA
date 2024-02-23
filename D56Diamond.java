public class D56Diamond {
    public static void main(String[] args) {
        int n =5;
        dia(n);
    }

    private static void dia(int n) {
        for (int row = 1; row <=2*n-1; row++) {
            int col;
            if (row <=n) {
                 col = row;
            }else {
                col = 2*n - row;
            }
            int space = n - col;
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < col; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
