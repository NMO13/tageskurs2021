import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int referenzZahl = random.nextInt(1000);
        int zahl;
        do {
            System.out.print("> ");
            zahl = scanner.nextInt();
            if (zahl < referenzZahl) {
                System.out.println("Zu klein");
            } else if(zahl > referenzZahl) {
                System.out.println("Zu groß");
            } else { // else if(zahl == referenzZahl)
                System.out.println("Richtig");
            }
        } while(zahl != referenzZahl);

    }
}
