
public class Inheritance {
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.eat();
        l1.hunt();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
    void breathe(){
        System.out.println("Animal can breathe");
    }
    void walk(){
        System.out.println("Animal can walk");
    }
}

class Lion extends Animal{
    void hunt(){
        System.out.println("Lion hunts deer.");
    }
}
