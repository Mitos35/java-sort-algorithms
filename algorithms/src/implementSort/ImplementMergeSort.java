package implementSort;

import java.util.Arrays;
import java.util.Random;

public class ImplementMergeSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length == 1) return;
        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];
        System.arraycopy(array, 0, first, 0, first.length);
        System.arraycopy(array, first.length, second, 0, second.length);
        mergeSort(first);
        mergeSort(second);
        merge(first, second, array);
    }

    private static void merge(int[] first, int[] second, int[] result) {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
}
