
    import java.util.Arrays;

    public class Rotatearray2 {
    // Function to rotate the array by d places
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        // If d is larger than the array length, take modulo to handle it
        d = d % n;

        // Step 1: Reverse the first part (0 to d-1)
        reverseArray(arr, 0, d - 1);

        // Step 2: Reverse the second part (d to n-1)
        reverseArray(arr, d, n - 1);

        // Step 3: Reverse the whole array (0 to n-1)
        reverseArray(arr, 0, n - 1);
    }

    // Helper function to reverse the array between given indices
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        rotateArray(arr, d);

        // Print the rotated array
        System.out.println(Arrays.toString(arr)); // Output: [4, 5, 6, 7, 1, 2, 3]
    }
}


