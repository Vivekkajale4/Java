public class KadanesMaximumSubarraySum {

    public static int kadaneWithAllNegative(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        

        for (int i = 0; i < nums.length; i++) {
            // Compute the maximum sum subarray ending at the current index
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,5,-3};
        int maxSubarraySum = kadaneWithAllNegative(nums);
        System.out.println("Maximum subarray sum is: " + maxSubarraySum);
    }
}
