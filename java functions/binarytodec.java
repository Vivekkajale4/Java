public class binarytodec {
    public static void BinToDec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;


        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        
        System.out.println("Decimal number is : "+decNum);
        
    }
    public static void main(String[] args) {
        BinToDec(100110);
    }
}
