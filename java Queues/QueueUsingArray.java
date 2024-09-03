class QueueUsingArray {
    static class Queue {
    static int rear,size;
    static int[] arr;
    Queue(int n){         // constructor for creating queue
        arr = new int[n];
        size = n;
        rear = -1;
    }
    // checking isempty or not
    public static boolean isEmpty(){
        return rear == -1;
    }
    //add
    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
        }
        rear = rear + 1;
        arr[rear] = data; 
    }
    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1 ;
        }
        int front = arr[0];
        for(int i = 0;i<rear;i++){
            arr[i] = arr[i+1];

        }
        rear = rear -1;
        return front;
       
    }
    //peek
    public static int  peek(){
        return arr[0];
    }
}
    
    
    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();
        }
        
    }
}
