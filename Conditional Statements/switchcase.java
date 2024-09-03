import java.util.*;

public class switchcase {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operation(-,+,/,*) : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
            System.out.println(num1-num2);
            break; 
            case '*':
            System.out.println(num1*num2);
            break; 
            case '/':
            System.out.println(num1/num2);
            break; 
            default:
                break;
        }
        sc.close();
    }
}
