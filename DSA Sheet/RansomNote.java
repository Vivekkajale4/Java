// LeetCode 383 RansomNote using hashmap

import java.util.HashMap;

public class RansomNote {
    public static boolean ransomnote(String Ransom, String Magzine){
        // creating HashMap for storing frequencies of characters of magzine
        
        HashMap <Character,Integer> Map = new HashMap<>();
        // Traversing of string magzine and storig freq count in hashmap
        for(char c : Magzine.toCharArray()){
            Map.put(c, Map.getOrDefault(c, 0)+1);
        }
        // Traversing ransomNote and check conditions
        for(char c : Ransom.toCharArray()){
            if (!Map.containsKey(c)|| Map.get(c)==0) {
                return false;
            }
            Map.put(c, Map.get(c)-1);
        }
        return true;
    }
    public static void main(String[] args) {
        String Ransom = "aaaa";
        String Magzine = "aaaaaab";
        System.out.println(ransomnote(Ransom, Magzine));
    }
}
