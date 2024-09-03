public class firstoccur {
    public static int firstoccurance(String hystack,String needle){
        int idx = -1;
        // it checks both string are equal or not if its equal return 0
        if(needle.equals(hystack)){
            return 0;
        }
        // loop through o to substraction of both string length
        for(int i = 0;i<= hystack.length()-needle.length();i++){
            //For each position i, a substring of the same length as 
            // the needle is extracted using haystack.substring(i, i + lengthOfNeedle). 
            // If this substring matches the needle, we update index with the value of i 
            // (the starting position of the match) and break out of the loop since we only 
            // need the first occurrence.


            if(hystack.substring(i, i+needle.length()).equals(needle)){
                idx = i;
                break;
            }
            
        }
        return idx;
    }
    public static void main(String[] args) {
        String hystack = "sadbutsad";
        String needle = "sad";
        System.out.println(firstoccurance(hystack, needle));
    }
}
