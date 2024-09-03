import java.util.*;

public class PushatBottom {
    public static void PushatBottom(Stack <Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushatBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        PushatBottom(s,10);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
