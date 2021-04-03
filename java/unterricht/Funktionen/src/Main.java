public class Main {

    public static void main(String[] args) {
        int z = 3;
        int x = maximum(z, 4); // a = z
        System.out.println(x);

        x = maximum(8, 2);
        System.out.println(x);

        printHallo();

        float x1 = dividiert(5, 0);
        System.out.println(x1);

        x1 = plus(8, 3);
        System.out.println(x1);

        // Übung


        // Übung
        String s = "sfisopfjABc";
        
        // Suche in s nach erstem A und gib den index zurück
        // Wenn A nicht existiert, ist index -1
        int index = indexVonA(s);
        System.out.println(index); // Ausgabe: 8


        index = indexVonA("BBaA");
        System.out.println(index); // Ausgabe: 3

    }


    static int indexVonA(String s) {
        int index = -1;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                index = i;
                break;
            }
        }
        return index;
    }

    static int maximum(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    static void printHallo() {
        System.out.println("Hallo");
        printWelt();
    }

    static void printWelt() {
        System.out.println("Welt");
    }

    // Übung Taschenrechner
    // 4 Funktionen: plus, minus, mal, dividiert
    // Jede Funktion nimmt 2 float Zahlen und liefert das Ergebnis zurück
    // Ergebnis printen
    // z. B. float ergebnis = plus(4, 5);
    // Ausgabe: 9

    static float plus(float a, float b) {
        System.out.println("a + b:");
        return a + b;
    }

    static float minus(float a, float b) {
        System.out.println("a - b:");
        float ergebnis = a - b;
        return ergebnis;
    }

    static float mal(float a, float b) {
        System.out.println("a * b:");
        return a * b;
    }

    static float dividiert(float a, float b) {
        System.out.println("a / b:");
        if (b == 0) {
            System.out.println("Achtung, Division durch 0!");
        }
        return a / b;
    }
}
