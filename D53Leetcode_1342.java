public class D53Leetcode_1342 {
    public static void main(String[] args) {
        System.out.println(steps(8));

    }
    static int steps(int n){
        return helper2(n,0);
    }

    private static int helper2(int n, int count) {
        if(n==0){
            return count;
        }
        if (n%2==0){
            return helper2(n/2,count+1);
        }else {
            return helper2(n-1,count+1);
        }
    }
}
