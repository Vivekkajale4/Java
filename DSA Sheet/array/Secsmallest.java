public class Secsmallest {
    public static int findSecSmallest(int[] nums){
        int smallest = nums[0];
        int secsmallest = Integer.MAX_VALUE;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] < smallest){
                secsmallest = smallest;
                smallest = nums[i];
            }
            else if(nums[i] != smallest && nums[i] <secsmallest){
                secsmallest = nums[i];
            }
        }
        return secsmallest;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,7,2,10,7};
        System.out.println(findSecSmallest(nums));
    }
}
