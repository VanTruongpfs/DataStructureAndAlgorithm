package dequymorong;

public class Exercise17 {
	public static int solve17(int n) {
		if(n<=0) {
			return -1;
		}
		if(n==1) {
			return 1;
		}
		return (int) (Math.pow(n, 2)+ solve17(n-1));
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(solve17(n));
	}
}
