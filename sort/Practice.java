package Exercise1.src.sort;

public class Practice {
    public static int[] mergeSort(int[] array) {
        int length = array.length;
        if(length<2){
            return array;
        }
        int mid = length/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length-mid];
        for(int i=0; i<mid; i++){
            leftArray[i] = array[i];
        }
        for(int i=mid; i<length; i++){
            rightArray[i-mid] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        //merge
        merge(array, leftArray, rightArray);


        return array;
    }
    public static int[] merge(int[] array, int[] leftArray, int[] rightArray){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i=0, j=0, k=0;
        while(i<leftSize && j<rightSize){
            if(leftArray[i]<rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightSize){
            array[k] = rightArray[j];
            j++;
            k++;
        }
        return null;
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

    public static void main(String[] args) {
        int[] array =  {8,9,3,4,11,2,7,8};
        System.out.println(display(mergeSort(array)));
    }
}
