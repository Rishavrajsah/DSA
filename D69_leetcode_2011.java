public class D69_leetcode_2011 {
    public static void main(String[] args) {
        String [] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));

    }
    public static int finalValueAfterOperations(String[] operations) {
        int X =0;
        //for(int i =0;i<operations.length;i++){
        for (String operation : operations) {
            if ("X++".equals(operation) || "++X".equals(operation)) {
                X = X + 1;
            } else {
                X = X - 1;
            }
        }
        return X;

    }
}
