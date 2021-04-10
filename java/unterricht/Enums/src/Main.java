import java.util.Arrays;
import java.util.Scanner;

public class Main {
    enum Himmelsrichtungen {
        NORDEN,
        OSTEN,
        SUEDEN,
        WESTEN
    }

    enum Frauenname {
        SANDRA,
        SARAH,
        KLARA
    }

    enum Maennername {
        MAX,
        HANS,
        GEORG
    }
    public static void main(String[] args) {
        Himmelsrichtungen richtungen = null;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num == 0) {
            richtungen = Himmelsrichtungen.NORDEN;
        }

        System.out.println(richtungen);
        richtungen = Himmelsrichtungen.OSTEN;
        System.out.println(richtungen);
        System.out.println(richtungen.name());

        System.out.println("Alle Frauennamen: " + Arrays.toString(Frauenname.values()));

        System.out.print("Name: ");
        String name = scanner.next();

        Frauenname[] frauenNameArray = Frauenname.values();
//        for(int i = 0; i < frauenNameArray.length; i++) {
//            System.out.println(frauenNameArray[i]);
//        }

        for(Frauenname wert : frauenNameArray) {
            if(name.equalsIgnoreCase(wert.name())) {
                System.out.println("Name " + name +" ist in Enum enthalten.");
            }
        }

        Maennername maennerName = Maennername.MAX;
        switch (maennerName) {
            case MAX:
                System.out.println("Ich heiße Max!");
                break;
            case HANS:
                System.out.println("Ich heiße Hans");
                break;
            default:
                System.out.println("Unbekannt");
        }
    }
}
