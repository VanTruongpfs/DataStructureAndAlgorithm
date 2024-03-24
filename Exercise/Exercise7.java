package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc =  new Scanner(System.in);
		int randomNumber = rd.nextInt(1, 100);
		int count = 0;
		int min = 0;
		int max = 0;
		
	while(true) {
		System.out.print("Nhap vao so ban muon doan: ");
		 int guessNumber = sc.nextInt();
		if(guessNumber > randomNumber) {
			max = guessNumber;
			count++;
			System.out.println("vui long nhap lai so nho hon: "+ max );
		}else if(guessNumber < randomNumber) {
			min = guessNumber;
			count++;
			System.out.println("vui long nhap lai so lon hon: "+  min );
		}else {
			count++;
			System.out.println("corret!. so lan doan la: "+ count);
			break;
		}
	}
}
}



