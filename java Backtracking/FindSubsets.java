public class FindSubsets {
    public static void findsubsets(String str, String ans , int i){
        //base case
        if(i== str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }
        //Recursion
        // yes choice
        findsubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findsubsets(str, ans, i+1);
    }
    public static int SubsetCount(String ans){
        int length = ans.length();
        return (int) Math.pow(2, length);
    }
    public static void main(String[] args) {
        String str = "abc";
        findsubsets(str, "", 0);
        int subsetcount = SubsetCount(str);
        System.out.println("No of Subsets are "+ subsetcount);

    }
}
