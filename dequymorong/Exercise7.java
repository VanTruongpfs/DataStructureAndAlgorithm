package dequymorong;

public class Exercise7 {
	public static int solve7(int n) {
		if(n<0) {
			return -1;
		}
		if(n/10==0) {
			return n%2!=0?1:0;
		}
		int count = n%2!=0?1:0;
		return count +solve7(n/10);
	}
	public static void main(String[] args) {
		int n = 123457;
		System.out.println(solve7(n));
	}
}
