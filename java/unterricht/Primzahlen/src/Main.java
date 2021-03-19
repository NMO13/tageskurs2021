public class Main {
    public static void main(String[] args) {
        int zahl = 7;

        // Variante 1: nicht so schön
        System.out.println("Variante 2");
        for(int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                System.out.println("Keine Primzahl");
                break;
            } else {
                System.out.println("Ist Primzahl");
            }
        }

        // Variante 2: etwas schöner
        System.out.println("Variante 2");
        boolean isPrim = true;
        for(int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                isPrim = false;
                break;
            }
        }
        if(isPrim == true) {
            System.out.println("Ist Primzahl");
        } else {
            System.out.println("Keine Primzahl");
        }

        // Variante 3: noch etwas schöner
        System.out.println("Variante 3");
        int i = 2;
        for(; i <= zahl; i++) {
            if (zahl % i == 0 && i < zahl) {
                System.out.println("Keine Primzahl");
                break;
            }

            if(i == zahl) {
                System.out.println("Eine Primzahl");
            }
        }
    }
}
