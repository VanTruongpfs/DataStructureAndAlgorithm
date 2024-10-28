package baitap;
import java.util.Iterator;

public class Exercise1 {
//1
	public static void updateValues(int[] array, int index, int newValue) {
		if(index > array.length-1 || index <0) {
			System.out.println("index phai >=0 va <= do dai cua mang");
		}else {
		array[index]=newValue;
		}
	}
//2
	public static boolean findElement(int[] array, int x) {
		for (int i = 0; i < array.length/2; i++) {
			if(array[i]==x || array[array.length-i-1]==x) {
				return true;
			}
		}
		return false;
	}
//3
	public static String display(int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			if(i==array.length-1) {
				result+=array[i]+"]";
			}else {
				result+=array[i]+",";
			}
		}
		
		return result;
	}
//4
	public static int sum(int[] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
//5
	public static double average(int[] array) {
		double result = 0;
		double sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		result = sum/array.length ;
		return result;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		updateValues(array, 2, 4);
		System.out.println(findElement(array, 4));
		System.out.println(display(array));
		System.out.println(sum(array));
		System.out.println(average(array));
	}
}

