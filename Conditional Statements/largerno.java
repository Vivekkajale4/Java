import java.util.*;

public class largerno {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("Greater of 3 is :"+num1);
            } else {
                System.out.println("Greater of 3 is :"+ num3);
            }
        } else if (num2 > num3){
            System.out.println("Greater of 3 is :"+num2);
        }
        else{
            System.out.println("Greater of 3 is :"+num3);
        }
        sc.close();
    }
    
}
