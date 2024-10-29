package dequymorong;

public class Exercise4 {
	public static int countNumber(int n) {
		if(n/10==0) {
			return 1;
		}
		return 1 + countNumber(n/10);
	}
	public static void main(String[] args) {
		int n = 12345;
		System.out.println(countNumber(n));
	}
}
