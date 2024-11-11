package dequymorong;

public class Exercise16 {
	public static int solve16(int n) {
		if(n<=0) {
			return -1;
		}
		if(n==1) {
			return 1;
		}
		return n+solve16(n-1);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solve16(n));
	}
}
