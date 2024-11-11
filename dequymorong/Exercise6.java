package dequymorong;

public class Exercise6 {
	public static int solve6(int n) {
		if(n<0) {
			return -1;
		}
		if(n/10==0) {
			return n%10;
		}
		return n%10*solve6(n/10);
	}
	public static void main(String[] args) {
		int n = 54321;
		System.out.println(solve6(n));
	}
}
