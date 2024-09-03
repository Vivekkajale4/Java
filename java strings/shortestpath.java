import java.util.*;

public class shortestpath {
    public static float shotpath(String path){
        int x= 0; 
        int y=0;
        
        for(int i = 0;i<path.length();i++){
            int dir = path.charAt(i);
            if(dir == 'E'){
                x++;
            }
            else if(dir == 'w'){
                x--;
            }
            else if(dir == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        

        int x2 = x*x;
        int y2 = y*y;
        return (float)(Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter directions : ");
        String str = sc.nextLine();

        System.out.println(shotpath(str));
        sc.close();

    }
}
