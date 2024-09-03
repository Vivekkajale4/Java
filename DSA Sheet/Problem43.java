public class Problem43 {
    public static String removeConsecutiveCharacter(String S) {
        int n = S.length();
        if (n == 0) return ""; // Handle the edge case for empty string
    
        StringBuilder result = new StringBuilder();
        result.append(S.charAt(0));
    
        for (int i = 1; i < n; i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                result.append(S.charAt(i));
            }
        }
    
        return result.toString();
    }
    
    public static void main(String[] args) {
        String S = "bcdebeaec";
        System.out.println(removeConsecutiveCharacter(S));
        // for(int i = 0;i<newstring.length();i++){
        //     System.out.println(newstring);
        // }
    }
}
