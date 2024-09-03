
public class Missingvalue {
    

    public static int findMissingNumber(int[] arr, int n) {
        // Iterate from 1 to n
    //     for (int i = 1; i <= n; i++) {
    //         boolean found = false;
    //         // Check if the current number i is present in the array
    //         for (int j = 0; j < arr.length; j++) {
    //             if (arr[j] == i) {
    //                 found = true;
    //                 break;
    //             }
                
    //         }
    //         // If the number is not found in the array, it's the missing number
    //         if (!found) {
    //             return i;
    //         }
    //     }
    //     // Return -1 if no missing number is found (this is just a safeguard)
    //     return -1;

    // Better approach using hashing
        // HashMap <Integer,Integer> map = new HashMap<>(n+1);
        // for(int i = 0;i<n-1;i++){
        //     map.put(arr[i], 1);
        // }
        // for(int i = 1;i<=n;i++){
        //     // if(!map.containsKey(i)){
        //     //     return i;
        //     // }
        //     if (map.getOrDefault(i, 0) == 0) { // If the value is 0, this number is missing
        //         return i;
        //     }
        // }
        // return -1;

    // Optimal approach XOR method 
    int xor1 = 0,xor2 = 0;
    for(int i = 0;i<n-1;i++){
        xor2 = xor2 ^ arr[i];
        xor1 = xor1 ^ (i+1);
    } xor1 = xor1 ^ n; //XOR up to [1...N]

    return (xor1 ^ xor2); // the missing number
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array
        int n = 6; // The length of the array should be n (including the missing number)
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
