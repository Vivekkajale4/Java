public class Seclargest {
    public static int Secondlargest(int[] nums){
        int largest = nums[0];
        int seclarge = Integer.MIN_VALUE;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > largest){
                seclarge = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i] > seclarge){
                seclarge = nums[i];
            }
            
        }
        return seclarge;
    }
    public static void main(String[] args) {
        int[] nums = {1,5,7,2,10,7};
        System.out.println(Secondlargest(nums));
    }
}
