public class Quicksort {
    public static void PrintArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pidx = partition(arr,si,ei);
        Quicksort(arr, si, pidx-1); // left
        Quicksort(arr, pidx+1, ei);  // right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si - 1; //to make place
        for(int j = si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,8,1,5,10};
        Quicksort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
