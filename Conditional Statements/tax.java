import java.util.*;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income:");
        int income = sc.nextInt();
        if(income <= 500000){
            System.out.println("Your tax is not deducted");
        }
        else if(income > 500000 && income <= 1000000){
            System.out.println("Your income tax is:" + income*0.2);
        }
        else{
            System.out.println("Your income tax is:" + income*0.3);
        }
        sc.close();
    }
    
}
