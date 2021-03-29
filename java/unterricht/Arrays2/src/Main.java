import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Anzahl Elemente der Reihe
        System.out.println("Anzahl der Elemente");
        Scanner eingabe = new Scanner(System.in);
        int n = eingabe.nextInt();
        
        // Shiftlänge
        System.out.println("Wie oft Shiften:");
        Scanner eingabe2 = new Scanner(System.in);
        int s = eingabe2.nextInt();

        Random random = new Random(0);
        int[] arr = new int[n];
        
    	// Befüllen des Arrays mit Zufallszahlen
        for (int i=0;i<n;i++) {
            arr[i] = random.nextInt(20);
        }

	    System.out.println("Rechts-Shift");
        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i=0;i<s;i++) {
            int temp = arr[arr.length - 1];
            for (int j=0;j<n-1;j++) {
                arr[arr.length -1-j] = arr[arr.length -2-j];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr) + "\n");

        System.out.println("Links-Shift");
        for (int i=0;i<n;i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i=0;i<s;i++) {
            int temp = arr[0];
            for (int j=0;j<n-1;j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length -1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
