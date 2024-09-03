

public class Abstractclass {
    public static void main(String[] args) {
        Horse obj = new Horse();
        obj.eat();
        
        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("Animal can eat.");
    }

    abstract void walk();
}

class Horse extends Animal{
    
    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}
class Piegion extends Animal{
   
    void walk(){
        System.out.println("Horse walk on 2 legs");
    }
}