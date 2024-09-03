public class StringConverter {
    public static String convertString(String str) {
        int upperCount = 0;
        int lowerCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }

        if (upperCount > lowerCount) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }

    public static void main(String[] args) {
        String input = "HelloWoRLd";
        String result = convertString(input);
        System.out.println(result);
    }
}