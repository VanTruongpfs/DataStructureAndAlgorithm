package Exercise1.src.sort;

public class TimSort {

    // insertion sort
    public static int[] insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= left && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }
    // merge sort
    public static int[] merge(int[] array, int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];

        for (int i = 0; i < len1; i++) {
            left[i] = array[l + i];
        }
        for (int i = 0; i < len2; i++) {
            right[i] = array[m + 1 + i];
        }

        int i = 0, j = 0, k = l;

        // Merge hai mảng con left và right
        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của mảng left (nếu có)
        while (i < len1) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của mảng right (nếu có)
        while (j < len2) {
            array[k] = right[j];
            j++;
            k++;
        }
        return array;
    }
    static int RUN = 32;
    // Chia mảng thành các "run" và sắp xếp từng "run" bằng Insertion Sort
    public static int[] timSort(int[] array, int n) {
        // Sắp xếp từng mảng con có độ dài RUN
        for (int i = 0; i < n; i += RUN) {
            insertionSort(array, i, Math.min((i + RUN - 1), (n - 1)));
        }

        // Merge các mảng con sau mỗi RUN
        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid < right) {
                    merge(array, left, mid, right);
                }
            }
        }
        return array;
    }
    //display
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
        int n = array.length;
        System.out.println(display(timSort(array, n)));
    }
}
