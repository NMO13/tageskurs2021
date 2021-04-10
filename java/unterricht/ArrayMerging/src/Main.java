import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Übung 1: Array merge
        int[] arr1 = {1, 9, 1, 4};
        int[] arr2 = {5, 7, 8, 6, 2};
        // merge nimmt alle Element von arr1 und arr2,
        // fügt diese zusammen und speichert sie in arr3
        int[] arr3 = merge(arr1, arr2);
        // Ausgabe: [1, 9, 1, 4, 5, 7, 8, 6, 2]
        System.out.println(Arrays.toString(arr3));

        // Übung 2: Array zip
        int[] arr4 = {9, 3, 8, 4};
        arr3 = zip(arr1, arr4);
        // Ausgabe: [1, 9, 9, 3, 1, 8, 4, 4]
        System.out.println(Arrays.toString(arr3));

        arr3 = zip(arr2, arr4);
        // Ausgabe: null
        System.out.println(Arrays.toString(arr3));

        // Übung 3: Fun with arrays
        // Arrays müssen gleich lang sein
        arr3 = funFunction(arr1, arr4);
        System.out.println(Arrays.toString(arr3));
        // 1, 9, 1, 4
        // 9, 3, 8, 4
        // [(1 + 9) * 3, (9 + 3) * 8, (1 + 8) * 4, (4 + 4) * 9]

    }

    static int[] funFunction(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return null;
        }
        int[] arr3 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            // 1. Möglichkeit für 2. Faktor
            //int temp = arr2[i+1];
            //if(i == arr1.length-1) {
            //    temp = arr2[0];
            //}

            // 2.Möglichkeit
            int temp = arr2[(i+1) % arr2.length];
            arr3[i] = (arr1[i] + arr2[i]) * temp;
        }
        return arr3;
    }

    static int[] zip(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return null;
        }
        int[] arr3 = new int[arr1.length * 2];
        for(int i = 0; i < arr1.length; i++) {
            arr3[i*2] = arr1[i];
            arr3[i*2+1] = arr2[i];
        }

//        for(int i = 0; i < arr3.length; i+=2) {
//            arr3[i] = arr1[i/2];
//            arr3[i+1] = arr2[i/2];
//        }
        return arr3;

    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];

        // Lösung mit 2 Schleifen
        for(int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            arr3[i+arr1.length] = arr2[i];
        }

        // Lösung mit einer Schleife
        for(int i = 0; i < arr3.length; i++) {
            if(i < arr1.length) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - arr1.length];
            }
        }
        return arr3;
    }
}
