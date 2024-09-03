

public class Constructors {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "John";
        s1.roll = 15;
        System.out.println(s1.name);
        System.out.println(s1.roll);

        student s2 = new student(s1);
        System.out.println(s2.name);
        
        

    }
}

class student{
    String name;
    int roll;
    
    // Non-parameterized constructor
    student(){
        System.out.println("non-parametrized constructor called.");
    }

    // Parameterized constructor
    student(String newname){
        this.name = newname;
    }

    //Copy constructor
    student(student s1){
        this.name = s1.name ;
        this.roll = s1.roll ;
    }



}
