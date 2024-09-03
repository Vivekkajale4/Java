public class Problem45 {
    public static String keypadsequence(String sentence){
        String output = "";
        String[] arr = {"2",    "22",  "222", "3",   "33", "333", 
        "4",    "44",  "444", "5",   "55", "555",
        "6",    "66",  "666", "7",   "77", "777",
        "7777", "8",   "88",  "888", "9",  "99",
        "999",  "9999" };
        for(int i = 0; i<sentence.length();i++){
            if(sentence.charAt(i) == ' ') {
                output+="0";
            }else{
                int position = sentence.charAt(i) - 'A';
                output = output + arr[position];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String sentence = "VIVEK";
       
        System.out.println(keypadsequence(sentence));               
    }
}
