import java.util.*;;

public class breakstatement {
    public static void main(String arg[]) {
        // for(int i = 1; i<=5; i++){
        // if(i==3){
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("Break statement execute.");

        // example
        // Scanner sc = new Scanner(System.in);
        // do{
        // System.out.println("Enter your number: ");
        // int number = sc.nextInt();
        // if(number%10==0){
        // break;
        // }

        // }while(true);
        // sc.close();

        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if(number%10==0){
        continue;
        }
        System.out.println(number);

        }while(true);
        

    }
}
