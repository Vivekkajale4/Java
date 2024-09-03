public class binomialcoeff {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
             f = f * i;
        }
        return f;
    }

    public static int binocoeff(int n ,int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int binocoeff = a / (b*c);
        return binocoeff;
    }
    public static void main(String arg[]){
        System.out.println(binocoeff(5,2));
    }
}
