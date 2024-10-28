package Exercise1.src.sort;
public class Sort {	
//bubble sort
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	public static int[] bubbleSortRecursive(int[] array, int n) {
		if(n==1) {
			return array;
		}
		for (int i = 0; i < n-1; i++) {
			if(array[i]>array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
		return bubbleSortRecursive(array, n-1);
	}
//selection sort
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j =i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	public static int[] selectionSortRecursive(int[] array, int n) {
		if(n==array.length-1) {
			return array;
		}else {
			int min = n;
			for (int i = n; i < array.length-1; i++) {
				if(array[min]>array[i+1]) {
					min = i+1;
				}
			}
			int temp = array[min];
			array[min] = array[n];
			array[n] = temp;
		}
		return selectionSortRecursive(array, n+1);
	}
// insert sort
	public static int[] insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int last = array[i];
			int j = i;
			while(j>0 && array[j-1]>last) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = last;
		}
		return array;
	}
	public static int[] insertSortRecursive(int[] array, int n) {
		if(n==1) {
			return array;
		}
		insertSortRecursive(array, n-1);
		int last = array[n-1];
		int j = n-2;
		while(j>=0 && array[j]>last) {
			array[j+1] = array[j];
			j--;
		}
		array[j+1] = last;
		return array;
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
//	public static int[] mergeSort(int[] array) {
//		if(array.length<=1) {
//			return array;
//		}
//		int mid = array.length/2;
//	}
	public static void main(String[] args) {
		int[] array =  {8,9,3,4,11,2,7,8};
//		System.out.println("bubble sort:" + display(bubbleSort(array)));
//		System.out.println("bubble sort use recursive:" + display(bubbleSortRecursive(array, array.length)));
//		System.out.println("selection sort:" + display(selectionSort(array)));
//		System.out.println("selection sort use recursive:" + display(selectionSortRecursive(array, 0)));
		System.out.println("insert sort:" + display(insertSort(array)));
//		System.out.println("insert sort use recursive:" + display(insertSortRecursive(array, array.length)));
	}
}
