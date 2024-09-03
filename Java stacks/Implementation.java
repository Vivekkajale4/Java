import java.util.*;

public class Implementation {
    static class InnerImplementation {
        // Using ArrayList 
        // static ArrayList <Integer> list = new ArrayList<>();
        // public static boolean isEmpty(){
        //     return list.size() == 0;
        // }
        // public static void push(int data){
        //     list.add(data);
        // }
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     list.remove(list.size()-1);
        //     return top;
        // }
        // public static int peek(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return list.get(list.size()-1);
        // }

        // Using Linked list
        // public static class Node{
        //     int data ;
        //     Node next;
        //     public Node(int data){
        //         this.data = data;
        //         this.next = null;
        //     }
        // }
        // static Node head = null;
        // public static boolean isEmpty(){
        //     return head == null;
        // }
        // public static void push(int data){
        //     Node newNode = new Node(data);
        //     if(isEmpty()){
        //         head = newNode;
        //         return;
        //     }
        //     newNode.next = head;
        //     head = newNode;
        // }
        // public static int pop(){
        //     if(isEmpty()){
        //         return -1;
        //     }
        //     return head.data;
        // }
        
    }
    public static void main(String[] args) {
        // Using java collection framework
        Stack <Integer> Example = new Stack<>();
        Example.push(1);
        Example.push(2);
        Example.push(3);
        Example.push(4);
        while (!Example.isEmpty()) {
            System.out.println(Example.peek());
            Example.pop();
        }
    }
}
