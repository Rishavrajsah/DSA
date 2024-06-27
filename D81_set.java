import java.util.*;

public class D81_set {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,6};
        removeDuplicateINPlace(arr);
    }
    static void removeDuplicate(int[] arr){
        Set<Integer> set  = new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
    static void removeDuplicateINPlace(int[] arr){
        Set<Integer> set  = new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
         int index =0;
//        List<Integer> list = new ArrayList<>(set);
//        for (int i = 0; i < list.size(); i++) {
//            arr[i]= list.get(i);
//        }
        for(int i:set){
            arr[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }
}
