package Exercise2;

public class Exercise2_2 {
/**
 * this method uses to check a number is prime number;
 * input: int n
 * output: true or false
 * @param n
 * @return
 * example:
 * 	input n=1 => false
 * 	input n=2 => true
 * 	input n=13 => true
 * 
 */
	public static boolean isPrimeNumber(int n) {
		if(n<=1) {
			return false;
		}else if(n==2) {
			return true;
		}else {
			for(int i = 2; i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}return true;
		}
	}
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(9));
	}
}
