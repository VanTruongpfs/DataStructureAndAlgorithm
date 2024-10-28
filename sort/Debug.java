package Exercise1.src.sort;

public class Debug {
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
    public static String display2d(int[][] array) {
        String result ="";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j==array[i].length-1) {
                    result+= array[i][j]+"]" +"\n";
                }else if(j==0) {
                    result+="["+ array[i][j]+",";
                }else{
                    result+= array[i][j] +",";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array =  {8,9,3,4,11,2,7,8};
        int[][] array2d = {{1,2,3},
                          {3,4},
                          {5,6},
                          {7,8}};
        int n = array.length;
        System.out.println(display2d(array2d));
    }
}
