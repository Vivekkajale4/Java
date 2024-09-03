
import java.util.*;

class Unionele {
    // bruteforce approach
    // static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
    //     HashSet<Integer> s = new HashSet<>();
    //     ArrayList<Integer> Union = new ArrayList<>();
    //     for (int i = 0; i < n; i++)
    //         s.add(arr1[i]);
    //     for (int i = 0; i < m; i++)
    //         s.add(arr2[i]);
    //     for (int it : s)
    //         Union.add(it);
    //     return Union;
    // }

    // optimal approach
    public static List<Integer> findUnion(int[] arr1, int n, int[] arr2, int m) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            // Avoid adding duplicates to the result
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                result.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                result.add(arr2[j]);
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n) {
            if (i > 0 && arr1[i] != arr1[i - 1]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < m) {
            if (j > 0 && arr2[j] != arr2[j - 1]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String args[]) {
        // int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        // ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        // System.out.println("Union of arr1 and arr2 is ");
        // for (int val : Union)
        //     System.out.print(val + " ");
        List<Integer> union = findUnion(arr1, arr1.length, arr2, arr2.length);
        
        System.out.println("Union of two sorted arrays: " + union);
    }
}
