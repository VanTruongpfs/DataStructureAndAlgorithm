package Exercise;

public class Exercise8 {
    public static String xorCode(String str, Byte pass){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            char encode = (char) (s^pass);
            result += encode;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Le Van Truong";
        Byte pass = 3;
        String encoded = xorCode(str, pass);
        String decrypt = xorCode(encoded, pass);
        System.out.println("encoded: "+ encoded);
        System.out.println("decrypt: "+ decrypt);
    }
}
