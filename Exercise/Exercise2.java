package Exercise;

public class Exercise2 {
/**a
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

/* b
*   example:
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
		System.out.println(isEven(14));
		System.out.println(isPrimeNumber(13));
	}
}
