import java.util.Stack;

public class ReverseString {
    public static String reverse(String str){
        Stack <Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newstring = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr_char = s.pop();

            newstring.append(curr_char);
        }
        return newstring.toString();
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String st = reverse(str);
        System.out.println(st);
    }
}
