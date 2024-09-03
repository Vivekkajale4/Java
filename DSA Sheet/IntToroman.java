public class IntToroman {
    public static String ConvertIntToRoman(int num){  // num is given parameter
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder result = new StringBuilder();

        for(int i = 0;i<values.length;i++){
             // While num is greater than or equal to the current value
            while (num >= values[i]) { 
                num -= values[i];
                result.append(symbols[i]);                
            }
        }
        return result.toString();

    }
    public static void main(String[] args) {
        System.out.println(ConvertIntToRoman(44));
    }
}
