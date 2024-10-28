package baitap;

public class CaesarCipher2 {
	
	public static String encode(String message, int secret) {
		String result ="";
		for (int i = 0; i < message.length(); i++) {
			char temp = (char) message.charAt(i);
			char temp1 = (char) (temp + secret);
			if(temp>='A' && temp<='Z') {
				if(temp1<='Z') {
					result = result + temp1;
				}else {
					result =  result + (char)('A'+temp1-'Z'-1);
				}
			}else {
				result += temp;
			}
		}
		return result;
	}
	
	public static String decrypt(String encode, int secret) {
		String result ="";
		for (int i = 0; i < encode.length(); i++) {
			char temp = (char) encode.charAt(i);
			char temp1 = (char) (temp - secret);
			if(temp>='A' && temp<='Z') {
				if(temp1>='A') {
					result = result + temp1;
				}else {
					result = result +(char)('Z'-('A'-temp1)+1);
				}
			}else {
				result += temp;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String message = "VENI,VIDI,VICI";
		String message1 = "THE EAGLE IS IN PLAY; MEET AT JOE'S. ";
		int secret = 3;
		String encode = encode(message, secret);
		System.out.println("encode: "+encode(message, secret));
		System.out.println("decrypt: "+decrypt(encode, secret));
		
		String encode1 = encode(message1, secret);
		System.out.println("encode: "+encode(message1, secret));
		System.out.println("decrypt: "+decrypt(encode1, secret));
	}
}
