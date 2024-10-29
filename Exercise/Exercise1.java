package Exercise;

public class Exercise1 {
/**
 * this method uses to round double the number
 * input: float n
 * output: int n
 * @param n
 * @return: int
 * example:
 *  input n=3.5 => 4;
 *  input n=3.2 => 3;
 */
	public static int roundNumber(float n) {
		int result = (int) n;
		if(n%1>=0.5) {
			return ++result;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(roundNumber(3.3f));
	}
}
