package dequymorong;

public class Exercise10 {
	public static int solve10(int n) {
		int result = 0;
		if(n<0) {
			return -1;
		}
		if(n/10==0) {
			return n;
		}
		int len = String.valueOf(n).length()-1;
		return (int) (n%10*Math.pow(10, len)+solve10(n/10));
		
	}
	public static void main(String[] args) {
		int n = 13045;
		System.out.println(solve10(n));
	}
}
