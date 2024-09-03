import java.util.Arrays;
class Problem44 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder Sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i = 0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
                
            }
            Sb.append(first[i]);
        }
        return Sb.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}