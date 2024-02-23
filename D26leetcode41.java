import java.util.Arrays;

public class D26leetcode41 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        firstMissingPositive(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>0){
                int correct = nums[i]-1;
                if(nums[i]< nums.length && nums[i]!=nums[correct]){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
