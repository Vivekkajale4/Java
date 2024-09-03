
import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Correct index calculation

            if (index < nums.length) { // Check to avoid index out of bounds
                if (nums[index] < 0) {
                    duplicates.add(Math.abs(nums[i]));
                } else {
                    nums[index] = -nums[index];
                }
            }
        }

        // Restore the array (optional, if you need to preserve the original array)
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 ,8};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println("Duplicates: " + duplicates);
    }
}
