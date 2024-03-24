package Exercise;

public class Exercise6 {
// a. viết hàm void printMatrix(int[][] matrix) hiển thị lên console mảng 2 chiều bất kỳ
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
// b. viết hàm int[][] createPascalTriangle(int size) 
    public static int[][] createPascalTriangle(int size){
        int[][] array = new int[size][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
        }
        for (int i = 0; i < array.length; i++) {    
            int index = 1;      
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = index++;
            }
        }
        return array;
    }
   //c. viết hàm int[][] createPascalTriangle(int[] diagonalValues)
    public static int[][] createPascalTriangle(int[] diagonalValues){
        int[][] array = new int[diagonalValues.length][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
        }
        for (int i = 0; i < array.length; i++) {    
            int index = array[i].length-1;      
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = diagonalValues[i]-index--;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] diagonalValues = {1,5,2,0};
        printMatrix(createPascalTriangle(5));
        printMatrix(createPascalTriangle(diagonalValues));
    }
}
