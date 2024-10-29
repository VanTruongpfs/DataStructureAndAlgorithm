package Exercise;
public class Exercise5 {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int n = a+1;
        while (b>0) {
            if(isPrime(n)){
                System.out.print(n+" ");
                b--;
            }
            n++;
        }
       
}
}