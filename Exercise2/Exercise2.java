package Exercise2;

public class Exercise2 {
/**
 * this method uses to check a number is Even
 * input: int n
 * output: true or false
 * @param n
 * @return true or false;
 * example:
 *  input: n = 13 => false
 *  input: n = 14 => true
 */
	public static boolean isEven(int n) {
		return n%2==0;
	}
	public static void main(String[] args) {
		System.out.println(isEven(14));
	}
}
