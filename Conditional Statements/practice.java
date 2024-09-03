import java.util.*;
public class practice {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number to check whether number is positive or negative : ");
        // int num = sc.nextInt();
        // if(num>0){
        //     System.out.println("Number is positive..");
        // }else{
        //     System.out.println("Number is negative..");
        // }

        // double temp = 11;

        // if( temp>100){
        //     System.out.println("You have fever.");
        // }else{
        //     System.out.println("You dont have fever.");
        // }
        
        // System.out.println("Enter day no. betn (1-7)");
        // int dayno = sc.nextInt();
        // switch (dayno) {
        //     case 1:
        //         System.out.println("Monday");
                
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
                
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
                
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
                
        //         break;
        //     case 5:
        //         System.out.println("Friday");
                
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
                
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
                
        //         break;
        
        //     default:
        //         System.out.println("Check input...");
        //         break;
        // }

        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap year");
                }else{
                    System.out.println("NOt a leap year");
                }
            }
            else{
                System.out.println("leap year");
            }

        }else{
            System.out.println("Not a leap year");
        }

        sc.close();
    }
    
}
