import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D25google448 {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
        System.out.println(Arrays.toString(arr));

    }
     static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while (i< nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i]= nums[correct];
                nums[correct] =temp;
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j< nums.length;j++){
            if (nums[j] != j+1){
                ans.add(j+1);
            }

        }
        return ans;
    }
}
