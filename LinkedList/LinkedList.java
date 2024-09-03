public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){

        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }


        //step2 = newNode next = head
        newNode.next = head; //link

        //step3 head = newNode
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    
    public void add(int idx,int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removefirst(){

        if(size == 0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removelast(){

        if(size == 0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }
    // search using iteration
    public int search(int key){
        Node temp = head;
        int i = 0;
        while (temp!=null) {
            if(temp.data == key){
                return i;
            }  
            temp = temp.next;
            i++;          
        }
        return -1;
    }
    // search using recursion
    public int helper(Node head,int key){
        if(head == null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }
    // Reverse a linkedlist
    public static void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;            
        }
        head = prev;

    }
    // IMP Find and Remove Nth node from linkedlist 
    public void deleteNthfromend(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            sz++;     
        }
        if(n==sz){
            head = head.next;
            return;
        }
        //sz-1
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while (i<itofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    // check linkedlist is palindrome or not
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next; // +1
            fast = fast.next.next; //+2           
        }
        return slow; // slow is mid
    }
    public boolean checkpalindrome(){
        if(head == null || head.next ==null){
            return true;
        }
        //step1 find mid
        Node midNode = findMid(head);
        //step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //step3 check left half and right half
        while (right!=null) {
            if(left.data != right.data){
                return false;
            } 
            left = left.next;
            right = right.next;           
        }
        return true;
    }

    public void print(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;            
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        // System.out.println("After adding new node");
        // ll.add(2, 10);
        // ll.print();
        // ll.removefirst();
        // ll.print();
        // ll.removelast();
        // ll.print();
        //System.out.println(ll.recsearch(8));
        //System.out.println("size of linkedlist is: "+ll.size);
        //ll.reverse();
        //ll.deleteNthfromend(3);
        System.out.println(ll.checkpalindrome());
        //ll.print();
    }
}