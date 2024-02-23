public class D34Repeting_array {
    // find number which is not repeating
    public static void main(String[] args) {
        int[] nums ={2,2,3,2,7,7,8,7,8,8};
        System.out.println(findnumber(nums));
    }

    private static int findnumber(int[] arr) {
        int unique = 3;
        //int a;
        for(int i : arr){
            unique %= i;
        }
         //a = unique % 3;
        return unique;
    }
}
