public class Ispalindrome {
    public static boolean ispalindrome(String str){
        str = str.toLowerCase(); // convert uppercase to lowercase if present
        int left= 0;
        int right = str.length()-1;
        while (left<right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Madam";
        System.out.println(ispalindrome(str));
    }
}
