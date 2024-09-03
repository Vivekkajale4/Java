

public class OOP {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(10);
        System.out.println(p1.gettip());
    }
}

class pen{
    private String color;
    private int tip;

    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color = newcolor;
    }
    void settip(int newtip){
        this.tip = newtip;
    }
}