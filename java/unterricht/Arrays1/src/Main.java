import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // neues Array erzeugen
        int[] arr = new int[6];

        // Array an Position 2 den Wert 5 einfügen
        arr[2] = 5;

        // Array an Positionen 2, 0 und 5 ausgeben
        System.out.println(arr[2]);
        System.out.println(arr[0]);
        System.out.println(arr[5]);

        // Komplettes Array händisch beschreiben (mühsam)
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;

        // besser mit Schleife
        for (int i= 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // Ausgabe der Adessse
        System.out.println("Die Adresse des Arrays lautet: " + arr);

        //Ausgabe des Inhaltes
        System.out.println("Ausgabe des Array Inhalts:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Ausgabe des Inhalts mit der Methode \"Arrays.toString()\":");
        System.out.println(Arrays.toString(arr));

        // Erste Übung
        System.out.println("Länge des Arrays:");
        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] arr1 = new int[a];
        int[] arr2 = new int[a];

        System.out.println("Aufsteigende Reihe der Länge " + a + ":");
        for (int i = 0; i < a; i++){
            arr1[i] = i;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Umdgedreht:");
        for (int i = 0; i < a; i++) {
            arr2[i] = arr1[arr1.length-1-i];
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("Fibonacci - Reihe als Array");
        int f = 0;
        int f1 = 1;
        for (int i = 0; i < a; i++) {

            arr1[i] = f;
            int f2 = f + f1;
            f = f1;
            f1 = f2;
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Fibonacci - Reihe als Array umgedreht");
        for (int i = 0; i < a; i++) {

            arr2[i] = arr1[arr1.length-1-i];
            int f2 = f + f1;
            f = f1;
            f1 = f2;
        }
        System.out.println(Arrays.toString(arr2));
        
        System.out.println("Fibonacci - Reihe umgedreht, in-place");
        for (int i = 0; i < a/2; i++){

            int temp = arr1[i];
            arr1[i] = arr1[arr1.length-1-i];
            arr1[arr1.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
