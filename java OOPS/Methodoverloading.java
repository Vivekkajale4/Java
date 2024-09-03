
public class Methodoverloading {
    public static void main(String[] args) {
        functions obj = new functions();
        System.out.println(obj.sum(2,4));
        System.out.println(obj.sum((float)2.5,(float)4.5));
        System.out.println(obj.sum(2,4,6));

    }
}

class functions{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a , int b,int c){
        return a+b+c;
    }
}
