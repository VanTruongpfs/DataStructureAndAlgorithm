package dequymorong;

public class Exercise1 {

/*
 * decimal to binary 
 * use recursive
 */
	public static String decToBi(int n) {
		if(n==0 || n == 1) {
			return n+"";
		}else {
			if(n/2==1) {
				return 1 +""+n%2;
			}else {
				return decToBi(n/2)+ ""+n%2;
			}
		}
	}
/*
 * binary to decimal
 * use recursive
 */
	public static int biToDec(String binary) {
		if(binary.length()==1) {
			return Integer.parseInt(binary);
		}
		int len = binary.length();
		int n = Integer.parseInt(String.valueOf(binary.charAt(0)));
		return (int) (n*Math.pow(2, len-1)+biToDec(binary.substring(1,binary.length())));
	}
/*
 * use loop
 */
	public static String deToBiNotR(int n) {
		String result = "";
		while(n!=0) {
			result = n%2+result;
			n=n/2;
		}
		return result;
	}
/*
 * use loop
 */
	public static int biToDecNotR(String binary) {
		int result = 0;
		for (int i = 0; i < binary.length(); i++) {
			int n = Integer.parseInt(String.valueOf(binary.charAt(i)));
			result+= n*Math.pow(2, binary.length()-1-i);
		}
		return result;
	}
	public static void main(String[] args) {
		int n = 11;
		String binary = "1011";
		System.out.println(decToBi(n));
		System.out.println(biToDec(binary));
		System.out.println(deToBiNotR(n));
		System.out.println(biToDecNotR(binary));
		
	}
}
