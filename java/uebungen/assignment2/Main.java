import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ////// Exercise 1: Mehrfach Shifting
        // Den Shift-Algorithmus haben wir bereits implementiert.
        // Jedoch funktioniert dieser immer nur für einen Shift.
        // Erweitere nun den Algorithmus dahingehend, dass die Shift-Länge beliebig festgelegt werden kann.
        // Mittels Scanner soll die Shiftlänge eingelesen werden können und in eine Variable "shiftLaenge" gespeichert
        // werden. Anschließend musst du den bestehenden Algorithmus in eine Schleife verschachteln.
        // Die Zahlenfolge soll wie gehabt zufällig generiert werden.

        // Beispiel:
        // Zahlenfolge: 3 2 9 1 9
        // shiftLaenge: 3
        // Ausgabe: 9 1 9 3 2

        System.out.println("Exercise 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shiftlänge: ");
        int shiftLaenge = scanner.nextInt();

        System.out.print("Anzahl Zahlen: ");
        int anzahlZahlen = scanner.nextInt();

        // Array mit Zufallszahlen befüllen
        Random random = new Random(0);
        int[] arr = new int[anzahlZahlen];

        // Befüllen des Arrays mit Zufallszahlen
        for (int i=0;i<anzahlZahlen;i++) {
            arr[i] = random.nextInt(20);
        }

        System.out.println("Zahlenreihe: " + Arrays.toString(arr));

        for(int i = 0; i < shiftLaenge; i++) {
            int temp;
            temp = arr[arr.length -1];
            for(int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        System.out.println("Ergebnis: " + Arrays.toString(arr));


        ////// Exercise 2:
        // Erzeuge auf der Konsole folgendes Muster:

        // XOOOOOX
        // OXOOOXO
        // OOXOXOO
        // OOOXOOO

        // Jedes Zeichen muss berechnet werden. Das heißt folgendes wäre z.B. ungültig:
        // System.out.println("XOOOOOX");

        // Tipp: Die X sind in V-Form angeordnet.
        // Tipp: Verwende zwei ineinander geschachtelte Schleifen.
        // Tipp: Arrays werden nicht benötigt.

        System.out.println("Exercise 2");
        int anzahlZeilen = 4;
        int anzahlSpalten = 7;
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                if(zeile == spalte || spalte == anzahlSpalten - 1 - zeile) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }

        ////// Exercise 3:
        // Erzeuge auf der Konsole folgendes Muster:

        // XOOOX
        // OXOXO
        // OOXOO
        // OXOXO
        // XOOOX

        // Tipp: Die X sind in X-Form angeordnet
        // Tipp: Verwende zwei ineinander geschachtelte Schleifen.
        // Tipp: Arrays werden nicht benötigt.

        System.out.println("Exercise 3");
        anzahlZeilen = 5;
        anzahlSpalten = 5;
        for(int zeile = 0; zeile < anzahlZeilen; zeile++) {
            for(int spalte = 0; spalte < anzahlSpalten; spalte++) {
                if(zeile == spalte || spalte == anzahlSpalten - 1 - zeile) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
            }
            System.out.println();
        }

    }
}
