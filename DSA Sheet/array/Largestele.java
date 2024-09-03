

public class Largestele{
    public static int findlargest(int[] arr){
        // brute force TC = O(nlogn)
        
        // Arrays.sort(arr);
        // int n = arr.length;
        // return  arr[n-1];
        
        //optimal solution TC = O(n)
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,2,10};
        System.out.println(findlargest(arr));
    }
}