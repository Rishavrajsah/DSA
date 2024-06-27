import java.util.Arrays;
import java.util.HashMap;

public class D79_Hashing {
    public static void main(String[] args) {
        int[] arr = {2,1,2,3,3,3,3,4};
//        System.out.println(Arrays.toString(hash(arr)));
//        String str = "abcdabcegghimnyr";
//        System.out.println(Arrays.toString(charHash(str)));
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1 );
        }
        System.out.println(mpp.get(2));

    }

    // hashing of number
    static int[] hash(int[] arr){
        int[] frequency = new int[5];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]] += 1;
        }
        return frequency;
    }
    // hashing of character
    static int[] charHash(String s){
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)-'a'] += 1;
        }
        return frequency;
    }

}
