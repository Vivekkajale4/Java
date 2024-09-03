import java.util.Arrays;

public class Move0toend {
    public static void movezerostoend(int[] arr){
        int index = 0;
        // Step 1: Traverse the array and move non-zero elements to the front
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        // Step 2: Fill the remaining positions with zeros
        for(int i= index;i<arr.length;i++){
            arr[i] = 0;
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,4};
        movezerostoend(arr);
        System.out.println(Arrays.toString(arr));
    } 
}
