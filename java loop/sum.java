import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range: ");
        int range = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=range){
            sum = sum+i;
            i++;
            
        }
        System.out.println("Sum of first natural number is: " + sum);
        sc.close();
    }
}
