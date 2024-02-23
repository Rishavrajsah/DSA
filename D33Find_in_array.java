public class D33Find_in_array {
    public static void main(String[] args) {
        int[] nums ={2,3,4,1,2,1,3,6,4};
        System.out.println(present(nums));
    }

    private static int present(int[] arr) {
        int unique =0;
        for(int i :arr){
            unique = unique^i; // unique ^= i;
        }
        return unique;
    }
}
