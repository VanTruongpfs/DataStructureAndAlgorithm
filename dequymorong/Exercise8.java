package dequymorong;

public class Exercise8 {
	public static int solve8(int n) {
		if(n<0) {
			return -1;
		}
		if(n/10==0) {
			return n%2==0?n:0;
		}
		int result = (n%10)%2==0?n%10:0;
		return result +solve8(n/10);
	}
	public static void main(String[] args) {
		int n = 123456;
		System.out.println(solve8(n));
	}
}
