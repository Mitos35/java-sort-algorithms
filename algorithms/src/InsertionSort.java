import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = CreateArray.createArray();
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}
