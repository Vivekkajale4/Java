import java.util.Arrays;

public class Rotatearray {
    public static void rotatearray(int[] arr) {
        // Save the first element to shift the array
        int temp = arr[0];
        
        // Shift elements to the left
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        
        // Place the first element at the end of the array
        arr[arr.length - 1] = temp;
        
        // Print the array using Arrays.toString
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotatearray(arr);  // Output: [2, 3, 4, 5, 1]
    }
}
