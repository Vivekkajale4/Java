import java.util.*;
public class javabasic{
    public static void main(String arg[]){
        // System.out.print("Hello World");

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a*b;
        // System.out.println(product);

        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sc.close(); // we have to close scanner otherwise it will give warning (not an error)
    }
}