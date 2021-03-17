import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = -3;
        int z = x + y;


        if(z >= 0) {
            System.out.println("z hat den Wert " + z +
                    " und ist somit größer gleich 0");
        } else {
            System.out.println("z hat den Wert " + z +
                    " und ist somit kleiner 0");
        }

        // wenn z >= 0 und z <= 5, dann printe "z ist 0-5"
        // wenn z > 5 und z <= 10, dann printe "z ist 6-10"
        // wenn z > 10 und z <= 15, dann printe "z ist 10-15"
        // sonst printe "Eine andere Zahl"

        if(z >= 0 && z <= 5) {
            System.out.println("z ist 0-5");
        } else if(z > 5 && z <= 10) {
            System.out.println("z ist 6-10");
        } else if(z > 10 && z <= 15) {
            System.out.println("z ist zwischen 11-15");
        } else {
            System.out.println("Eine andere Zahl");
        }

        z = 20;
        if (z > 5 && z != 40) {
            System.out.println("z ist größer 5");
        }

        if (z > 10) {
            System.out.println("z ist größer 10");
        }

        /// ÜBUNG JAHRESZEITEN
//        Scanner scanner = new Scanner(System.in);
//        String jahreszeit = scanner.nextLine();
//        if(jahreszeit.equals("Frühling")) {
//            System.out.println("Es ist " + jahreszeit);
//        } else if(jahreszeit.equals("Sommer")) {
//            System.out.println("Es ist " + jahreszeit);
//        } else if(jahreszeit.equals("Herbst")) {
//            System.out.println("Es ist " + jahreszeit);
//        } else if(jahreszeit.equals("Winter")) {
//            System.out.println("Es ist " + jahreszeit);
//        }
//        else {
//            System.out.println("Unbekannt");
//        }


        /// ÜBUNG SCHALTJAHR
        // Ein Schaltjahr ist ein Jahr, das durch 4 teilbar ohne Rest ist
        // Ein Jahr, das durch 100 ohne Rest teilbar ist, ist kein Schaltjahr...
        // ... es sei denn, das Jahr ist durch 400 teilbar, dann ist ein ein Schaltjahr
        int year = 1904;
        boolean x1 = year % 4 == 0;
        if(x1) {
            System.out.println("Schaltjahr!");
        } else {
            System.out.println("Kein Schaltjahr");
        }
    }
}
