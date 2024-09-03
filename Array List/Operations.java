import java.util.ArrayList;
import java.util.Collections;
public class Operations{
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2) );
        list.set(idx2, temp);
    }
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();
        // Add operation
        list.add(4);
        list.add(10);
        list.add(2);
        list.add(78);
        list.add(8);

        System.out.println(list);

        // //Get operation
        // int ele = list.get(1);
        // System.out.println(ele);

        // // Delete element
        // list.remove(1);
        // System.out.println(list);

        // //set element at index
        //  list.set(0, 10);
        //  System.out.println(list);
        
        //  // contains (check if element is present or not in the list)
        //  System.out.println(list.contains(3));

        // for(int i = 0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        // Reverse of ArrayList
        // for(int i = list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }

        //find maximum 
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<list.size();i++){
        //     if(max < list.get(i)){
        //          max = list.get(i);
                
        //     }
           
        // }
        // System.out.println(max);

        // swap two elements
        // int idx1 = 1,idx2=3;
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // sorted list
        Collections.sort(list);
        System.out.println(list);

    }

}