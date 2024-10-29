package dequymorong;

public class Exercise9 {
	public static int solve9(int n) {
		if(n<0) {
			return -1;
		}
		if(n/10==0) {
			return n%2!=0?n:1;
		}
		int result = (n%10)%2!=0?n%10:1;
		return result*solve9(n/10);
	}
	public static void main(String[] args) {
		int n = 1234536;
		System.out.println(solve9(n));
	}
}
