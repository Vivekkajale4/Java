public class Problem81 {
    public static boolean PrintPairs(int[] arr, int diff){
        int n = arr.length;
        int i = 0;
        int j = 1;
        while (i<n && j<n) {
            if (i!=j && arr[i]-arr[j] == diff || arr[j]-arr[i] == diff ) {
                System.out.println("Pairs are:"+arr[i]+ " " +arr[j]);
                System.out.println("Index of pairs are:"+i+" "+j);
                return true;
                
            } 
            if(arr[i]-arr[j] < diff){
                j++;
            }else{
                i++;
            }
        }
        System.out.println("No such pairs.");
        return false;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        PrintPairs(arr, 6);
    }
}
