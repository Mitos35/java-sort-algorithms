package implementSort;

import java.util.Arrays;
import java.util.Random;

public class ImplementInsertionSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prevent = i -1;
            while (prevent >= 0 && array[prevent] > current) {
                array[prevent + 1] = array[prevent];
                prevent--;
            }
            array[prevent+1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
}
