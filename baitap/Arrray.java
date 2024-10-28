package baitap;

public class Arrray {
// PrimeNumber
	public static boolean primeNumber(int n) {
		if(n==1 || n==0) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static String display(int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if(i==array.length-1) {
				result+= array[i]+"]";
			}else {
				result+= array[i] +",";
			}
		}
		return result;
	}
// Sort
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
// reverse
	public static int[] reverse(int[] array) {
		for (int i = 0; i <= array.length/2; i++) {
			int temp = array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] array = {9,2,5,1,6};
		System.out.println(display(sort(array)));
		System.out.println(display(reverse(array)));
		System.out.println(primeNumber(15));
	}
}
