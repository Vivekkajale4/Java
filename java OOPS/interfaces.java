
public class interfaces {
    public static void main(String[] args) {
        Bear bhalu = new Bear();
        bhalu.eat();
    }
}

interface Herbivore{
    void eat();
}
interface Carnivore{
    void eat();
}

class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("eat grass as well as meat.");
    }
}