package Exercise;

public class Exercise3 {
/**
 * this method uses to count number of a number;
 * input: int n
 * output: int count
 * @param n
 * @return
 * example:
 *  input n=123 =>3
 *  input n=1234 =>4
 *  input n=-123 =>3
 *  
 */
	public static int countNumber(int n) {
		int count =0;
		while(n!=0) {
			n = n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countNumber(12324));
	}
}
