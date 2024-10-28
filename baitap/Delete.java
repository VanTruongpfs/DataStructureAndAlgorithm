package baitap;

public class Delete {
	public static String display(char[] array) {
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
	public static int[] delete(int[] array, int index) {
		int[] result = new int[array.length-1];
		for (int i = index; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		for (int i = 0; i < result.length; i++) {
			result[i]=array[i];
		}
		return result;
	}
	public static char[] add(char[] array1, char[] array2) {
		char[] result = new char[array1.length+array2.length];
		for (int i = 0; i < array1.length; i++) {
			result[i]=array1[i];
		}
		int count =0;
		for (int i = array1.length; i < result.length; i++) {
			result[i]=array2[count++];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array = {1,3,45,6};
		char[] array1 =  {'2','g','f'};
		char[] array2 =  {'2','g','f'};
//		System.out.println(display(delete(array, 2)));
		System.out.println(display(add(array1, array2)));
	}
}
