package Exercise1.src.baitap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Review {
    //so nguyen to
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // dem so nguyen to cua so n
    public static int countPrime(int n) {
        int count = 0;
        boolean isPrime = true;
        for(int i =2; i<=n; i++ ){
            for(int j =2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
            isPrime = true;
        }
        return count;
        }
        // giai thua
        public static int factorialRecursive(int n){
        if(n == 1){
            return 1;
        }
        return n * factorialRecursive(n-1);
        }
        //chuyen co so dem
        public static String decToBinary(int n){
        if(n==1){
            return "1";
        }
        String binary = n%2==0?"0":"1";
        return decToBinary(n/2)+binary;
        }
        public static int binaryToDec(String binary){
        int len = binary.length()-1;
        if(binary.length()==1){
            if(binary.equals("0")){
                return 0;
            }else{
                return 1;
            }
        }
        int temp = Integer.parseInt(binary.charAt(0)+"");
        return (int) Math.pow(2, len)*temp + binaryToDec(binary.substring(1,binary.length()));
        }
        // linear search
        public static boolean linearSearch(int[] arr, int target, int cursor){
        if(arr==null||arr.length==0){
            return false;
        }
        if(cursor>=arr.length || cursor<0){
            return false;
        }
        if(arr[cursor]==target){
            return true;
        }
        return linearSearch(arr,target,cursor+1);
        }
        // binary search ->> da sap xep
        public static boolean binarySearch(int[] arr, int target, int low, int high) {
            int mid = (low + high) / 2;
            if (arr == null || arr.length == 0) {
                return false;
            }
            if(low==high&&arr[mid]!=target){
                return false;
            }
            if (arr[mid] == target) {
                return true;
            }else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, high);
            }else if (arr[mid] > target) {
                return binarySearch(arr, target, low, mid - 1);
            }
            return false;
        }
            public static void main(String[] args) {
        int n = 11;
        int target = 13;
        int[] arr = {1,2,3,4,5,6,10,11};
//        String binary = decToBinary(n);
//        System.out.println(countPrime(n));
//        System.out.println(factorialRecursive(n));
//        System.out.println(decToBinary(n));
//        System.out.println(binaryToDec(decToBinary(n)));
//        System.out.println(linearSearch(arr,target,0));
//        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
}
