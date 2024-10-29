package Learn;

public class Comma {
    public static String insertComma(int number){
        String result = "";
        String s = String.valueOf(number); // ep kieu
        int count = 0;
        for (int i = s.length()-1; i>=0; i--) {
            String temp = String.valueOf(s.charAt(i)); //1
            if(count%3==0 && count!=0){
                result = temp +","+ result;
            }else{
                result = temp + result;
            }
            count++;
        }
        return result;
    }
     public static void main(String[] args) {
       int number = 19234513; 
        System.out.println(insertComma(number));
    }
    
}
