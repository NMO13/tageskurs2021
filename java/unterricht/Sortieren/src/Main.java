import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 13, 7, 1, 34, 4, 1};
        int[] zielArray = new int[array.length];
        // 1. Sortieren von positiven Zahlen
        // mit zusätzlichem Array
        for(int i = 0; i < array.length; i++) {
            int minimum = Integer.MAX_VALUE;
            int minimumIndex = 0;

            // 1. finde kleinste Zahl
            for(int j = 0; j < array.length; j++) {
                if(minimum > array[j] && array[j] != -1) {
                    minimum = array[j];
                    minimumIndex = j;
                }
            }
            // 2. speichere in Zielarray
            zielArray[i] = minimum;

            // Array überschreiben mit -1
            array[minimumIndex] = -1;
        }

        System.out.println(Arrays.toString(zielArray));

        // Dominiks Lösung

        int[] array2 = {7, 13, 7, 1, 34, 4, 1};
        int[] zielArray2 = new int[array2.length];

        // 1. Sortieren von positiven Zahlen
        // mit zusätzlichem Array
        for(int i = 0; i < array2.length; i++) {
            int minimum = Integer.MAX_VALUE;
            int minimumIndex = 0;

            // 1. finde kleinste Zahl
            for(int j = 0; j < array2.length; j++) {
                if(minimum > array2[j] && array2[j] != -1) {
                    minimum = array2[j];
                    minimumIndex = j;
                }
            }
            // 2. speichere in Zielarray
            zielArray2[i] = minimum;

            // Array überschreiben mit -1
            array2[minimumIndex] = -1;
        }

        System.out.println(Arrays.toString(zielArray2));

        // Selection Sort
        System.out.println("Selection Sort");
        int[] arraySelectionsort = {7, 13, 7, 1, 34, 4, 1};
        for(int i = 0; i < arraySelectionsort.length; i++) {
            int min_index = i;
            for(int j = i + 1; j < arraySelectionsort.length; j++) {
                if(arraySelectionsort[j] < arraySelectionsort[min_index]) {
                    min_index = j;
                }
            }
            int temp = arraySelectionsort[i];
            arraySelectionsort[i] = arraySelectionsort[min_index];
            arraySelectionsort[min_index] = temp;
        }
        System.out.println(Arrays.toString(arraySelectionsort));

        // Übung Bubble-Sort
        int[] arrayBubblesort = {7, 13, 7, 1, 34, 4, 1};

        for(int i = 0; i < arrayBubblesort.length; i++) {
            for(int j = 0; j < arrayBubblesort.length-1; j++) {
                if(arrayBubblesort[j] > arrayBubblesort[j+1]) {
                    int temp = arrayBubblesort[j];
                    arrayBubblesort[j] = arrayBubblesort[j+1];
                    arrayBubblesort[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arrayBubblesort));
        }

        // Array sortieren
        Integer[] array3 = {4, 7, 3, 9, -2, 3, 0, 1, -10};
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));

        // Array absteigend sortieren
        Arrays.sort(array3, Collections.reverseOrder());
        System.out.println(Arrays.toString(array3));

        // String array
        String[] namen = new String[3];
        namen[0] = "Yara";
        namen[1] = "}Andreas";
        namen[2] = "Max";
        Arrays.sort(namen);
        namen[0] = "Susi";
        namen[0] = namen[0].replace('S', 'L');
        System.out.println(Arrays.toString(namen));
    }

}
