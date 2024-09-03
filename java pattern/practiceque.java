import java.util.Scanner;

public class practiceque {
    public static void main(String[] args) {
        // 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter row and col");
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // for (int i = 1; i <= row; i++) {
        // for (int j = 1 ; j <= col; j++)
        // if((i==1 || i==col) || (j==1 || j==col) || (i==row))
        // System.out.print("*");
        // else
        // System.out.print(" ");

        // System.out.println();
        // }
        // sc.close();

        // 2
        // int n = 6;
        // for(int i=1;i<=n;i++){
        // for(int j = n-i+1;j >= 1;j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 3
        //int start = 1;
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==1){

                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
                // System.out.print(start+" ");
                // start++;
            }
            System.out.println();
        }

    }
}
