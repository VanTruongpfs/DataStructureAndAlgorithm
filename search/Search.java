package search;

public class Search {
//linear search
	public static boolean linearSearch(int[] array, int target) {
		for (int i = 0; i <= array.length/2; i++) {
			if(array[i]==target || array[array.length-i-1]==target) {
				return true;
			}
		}
		return false;
	}
	public static boolean linearSearchRecursive(int[] array, int target, int cursor) {
		if(cursor<0||cursor>=array.length) {
			return false;
		}
		if(array[cursor]==target) {
			return true;
		}else {
			return linearSearchRecursive(array, target, cursor+1);
		}
	}
//binary search(arranged)
	public static boolean binarySearch(int[] array,int target, int low, int high) {
		if(low>high) {
			return false;
		}else if(low==high) {
			if(array[low]==target) {
				return true;
			}else {
				return false;
			}
		}else {
			int mid = (low+high)/2;
			if(array[mid]==target) {
				return true;
			}else if(array[mid]<target) {
				return binarySearch(array, target, mid+1, high);
			}else {
				return binarySearch(array, target, low, mid-1);
			}
		}
	}
	
	public static boolean binarySearchNoRecursive(int[] array, int target) {
		int low = 0;
		int high = array.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(array[mid]==target) {
				return true;
			}else if(array[mid]<target) {
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array =  {1,2,3,4,5,6,7,8};
		int low = 0;
		int high = array.length-1;
		int target = 6;
		int cursor = 0;
		System.out.println(linearSearch(array, target));
		System.out.println(linearSearchRecursive(array, target, cursor));
		System.out.println(binarySearch(array, target, low, high));
		System.out.println(binarySearchNoRecursive(array, target));
	}
}
