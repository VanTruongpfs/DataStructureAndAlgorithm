package dequymorong;

public class Exercise5 {
	public static int solve5(int n) {
		if(n<0) {
			return -1;
		}
		if(n/10==0) {
			return n%10;
		}
		return n%10+solve5(n/10);
	}
	public static void main(String[] args) {
		int n = 123456;
		System.out.println(solve5(n));
	}
}
