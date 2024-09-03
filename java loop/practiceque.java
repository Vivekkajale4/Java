import java.util.*;

public class practiceque {
    public static void main(String arg[]) {
        // 1
        // for (int i = 0; i < 5; i++) {
        // System.out.println("Hello");
        // i += 2;
        // }

        // 2
        // Scanner sc = new Scanner(System.in);

        
        // int Esum = 0;
        // int Osum = 0;
        // int choice;
        // int number;

        // do{
        //     System.out.println("Enter the number: ");
        //     number = sc.nextInt();
        //     if(number%2==0){
        //         Esum+=number;
        //     }else{
        //         Osum+=number;
        //     }
        //     System.out.print("Do you want to continue if yes type 1 else type 0:  ");
        //     choice = sc.nextInt();

        // }while(choice==1);

        // System.out.println("Sum of even number is : "+Esum);
        // System.out.println("Sum of odd number is : "+Osum);
        
        
        // sc.close();
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial * i;
            //factorial *= i;
        }
        System.out.println(factorial);

    }
}
