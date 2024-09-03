import java.util.ArrayList;;
public class Maxwater {
    public static int maximum_water(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i = 0;i<height.size();i++){
            for(int j= 0;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int current_water = ht * width;
                maxwater = Math.max(maxwater, current_water);
            }
        }
        return maxwater;
    }
    public static int optimized_max_water(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;                 // left pointer
        int rp = height.size()-1;   // right pointer
        while(lp<rp){
        int ht = Math.min(height.get(lp), height.get(rp));
        int width = rp - lp;
        int current_water = ht * width;
        maxwater = Math.max(maxwater, current_water);

        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;
        }
    }
        return maxwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //System.out.println(maximum_water(height));
        System.out.println(optimized_max_water(height));

        
    }
}
