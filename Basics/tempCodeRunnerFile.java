import java.util.*;
public class practice {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if(year%4==0 && year%400==0){
            System.out.println("leap year.");
        }else if(year%100==0){
            System.out.println(" leap year.");
        }

        sc.close();
    }
    
}