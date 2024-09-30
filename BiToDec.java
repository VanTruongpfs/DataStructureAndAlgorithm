package dequymorong;

public class BiToDec {
	public static int biToDec(String binary) {
		if(binary.length()==1) {
			return Integer.parseInt(binary);
		}
		int len = binary.length();
		int n = Integer.parseInt(String.valueOf(binary.charAt(0)));
		return (int) (n*Math.pow(2, len-1)+biToDec(binary.substring(1,binary.length())));
	}
	public static void main(String[] args) {
		String binary = "1011";
		System.out.println(biToDec(binary));
	}
}
