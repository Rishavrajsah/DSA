public class D59pattern {
    public static void main(String[] args) {
        tri1(5,0);
        tri2(5,0);

    }
    static void tri1(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            System.out.print("*");
            tri1(row,col+1);
        } else {
            System.out.println();
            tri1(row-1,0);
        }
    }
    static void tri2(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            tri2(row,col+1);
            System.out.print("*");
        } else {
            tri2(row-1,0);
            System.out.println();
        }
    }
}
