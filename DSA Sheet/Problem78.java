import java.util.*;

public class Problem78 {
    public static List<Integer> commonelements(int[]A,int[]B,int[]C){
        int i=0,j=0,k=0;
        ArrayList <Integer> Common = new ArrayList<>();
        while (i<A.length && j<B.length && k<C.length) {
            if(A[i] == B[j] && B[j] == C[k]){
                Common.add(A[i]);
                i++;
                j++;
                k++;
                while (i<A.length && A[i] == A[i-1]) {
                    i++;                    
                }
                while (j<B.length && B[j] == B[j-1]) {
                    j++;                    
                }
                while (k<C.length && C[k] == C[k-1]) {
                    k++;                    
                }
            }else if(A[i]<B[j]){
                i++;
            }else if(B[j]<C[k]){
                j++;
            }else{
                k++;
            }
            
            
        }
        return Common;
    }
    public static void main(String[] args) {
        int[] A = { 1, 5, 10, 20, 30 };
        int[] B = { 5, 13, 15 };
        int[] C = { 5, 20 };

        List<Integer> Common = commonelements(A, B, C);

        System.out.print("Common Elements: ");
        for (int ele : Common) {
            System.out.print(ele + " ");
        }
    }
}
