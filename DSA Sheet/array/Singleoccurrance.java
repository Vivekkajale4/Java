public class Singleoccurrance {
    public static int occurrance(int[] arr) {
        int unique = 0;

        for (int nums : arr) {
            unique = unique ^ nums;
        }
        return unique;
    }

    

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        System.out.println(occurrance(arr));
    }
}
