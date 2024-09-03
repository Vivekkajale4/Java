import java.util.*;

public class even_odd {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num %2 == 0){
            System.out.println("Given number is even");
        } else{
            System.out.println("Given number is odd");
        }
        sc.close();
    }
    
}
