import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1 dimensionales Array
        int[] n = new int[10];
        System.out.println(Arrays.toString(n));

        // 2 dimensionales Array
        int[][] n1 = new int[3][3];
        System.out.println("Adresse des Arrays:" + n1);

        // Adressen
        System.out.println("Adresse der 1. Reihe: " + n1[0]);
        System.out.println("Adresse der 2. Reihe: " + n1[1]);
        System.out.println("Adresse der 3. Reihe: " + n1[2]);

        // Array Element befüllen
        n1[0][1] = 3;
        System.out.println("Arrayelement an der 0. Zeile und 1. Spalte: " + n1[0][1]);

        // Gesamtes Adressenarray ausgeben
        System.out.println("Gesamtes Array: " + Arrays.toString(n1));

        // Gesamtes Array 0 ausgeben
        System.out.println("Gesamtes Array 0: " + Arrays.toString(n1[0]));

        // 3 dimensionales Array
        int[][][] n2 = new int[3][2][4];

        // Array Element befüllen
        n2[0][0][1] = 5;
        System.out.println(n2[0][0][1]);

        System.out.println("Gesamtes Array 0: " + Arrays.toString(n2[0]));

        // ÜBUNG Array befüllen
        // 1. 2D Array der größe 5x3 anlegen
        // Aufsteigen befüllen (mit 1 starten)

        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15

        // Lösung mit counter
        int counter = 1;
        int[][] arr = new int[3][5];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = counter;
                counter++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // Lösung ohne counter
        System.out.println("Lösung ohne Counter");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[0].length * i + j + 1;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // Dominiks Lösung
        System.out.println("Dominiks Lösung");
        int spalten = arr[0].length;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < spalten; j++) {
                arr[i][j] = j+1+(i*arr[0][spalten-1]);
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
