

public class arrayoperations {
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]= {98,89,100};
        update(marks);
        // System.out.println(marks.length);
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println();
        
        // String name[] =  {"Rohan","shayam"};
        // System.out.println(name[1]);
    }

}
