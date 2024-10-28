package baitap;

public class CaesarCipher1 {
	protected char[] encoder = new char[26];
	protected char[] decoder = new char[26];
//this is constructor
	public CaesarCipher1(int rotation) {
		for (int i = 0; i < 26; i++) {
			encoder[i]=(char) ('A'+(i+rotation)%26);
			decoder[i]=(char) ('A'+(i-rotation+26)%26);
		}
	}
//
	private static String transform(String original, char[] code) {
		char[] message = original.toCharArray();
		for (int i = 0; i < message.length; i++) {
			if(Character.isUpperCase(message[i])) {
				int j = message[i] - 'A';
				message[i] = code[j];
			}
		}
		return new String(message);
	}
//
	public String encrypt(String message) {
		return transform( message, encoder);
			
	}
//
	public String decrypt(String secret) {
		return transform(secret, decoder);
	}
	
	
	public static void main(String[] args) {
		CaesarCipher1 cipher = new CaesarCipher1(3);
		System.out.println("Encryption code: "+new String(cipher.encoder));
		System.out.println("Decryption code: "+new String(cipher.decoder));
		String message = "Render to Caesar what is Caesar’s ";
		String coded = cipher.encrypt(message);
		System.out.println("Secret: "+coded );
		String answer = cipher.decrypt(coded);
		System.out.println("Message: "+ answer);
	}
}

