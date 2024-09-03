
public class Recursionbasic {
    // print n to 1 in decreasing order
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    // print 1 to n in increasing order
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n+" ");
        //printinc(n+1);
    }
    // factorial of n ,time complexity O(n) & space complexity O(n)
    public static int factorial(int n ){
        if(n==0){
            return 1;
        }
        int fact_n_minus_1 = factorial(n-1);
        int fact_n = n * fact_n_minus_1;
        return fact_n;
    }

    // sum of first n natural numbers ,time complexity O(n) & space complexity O(n)
    public static int sumofnum(int n){
        if(n==1){
            return 1;
        }
        int sumofnm1 = sumofnum(n-1);
        int sumofn = n + sumofnm1;
        return sumofn;

    }
    // print nth no of fibonacci series
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnM1 = fibonacci(n-1);
        int fibnM2 = fibonacci(n-2);
        int fibN = fibnM1+fibnM2;
        return fibN;
    }
    //array is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    //first occurance
    public static int firstoccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }
    //last occurance
    public static int lastoccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastoccurance(arr, key, i+1);
        if(isFound == -1 && arr[i]==key ){
            return i;
        }
        
        return isFound;
    }

    // base to the power of n (X^n)


    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }
    // Optimized power function time complexity O(log n)
    public static int OptimizedPower(int x , int n){
        if(n==0){
            return 1;
        }
        // if power is even 
        int halfpower = OptimizedPower(x, n/2);
        int halfpowersquare = halfpower * halfpower;
        
        // if power is odd
        if(n % 2 != 0){
            halfpowersquare =  x * halfpowersquare;
        }

        return halfpowersquare;
    }
    // Tiling problem
    public static int tilingProblem(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical approach
         int fnminus1 = tilingProblem(n-1);
        // horizontal approach
        int fnminus2 = tilingProblem(n-2);

        int totalways = fnminus1 + fnminus2;
        return totalways;

    }
    // remove duplicates from string
    public static void RemoveDuplicates(String str, int idx, StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            RemoveDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            RemoveDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    // friends pairing
    public static int pairing(int n){
        if(n==1 || n==2){
            return n;
        }

        int fnm1 = pairing(n-1);

        int fnm2 = pairing(n-2);
        int pairways = (n-1) * fnm2;

        int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,3};
        //String str = "appnacollege";
        System.out.println(pairing(3));
    }
}
