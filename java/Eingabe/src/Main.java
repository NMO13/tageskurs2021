import javax.swing.table.TableStringConverter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Operand
        System.out.println("1. Wert: ");
        String a = scanner.nextLine();
        double x = Double.parseDouble(a);
        // 2. Operand
        System.out.println("2. Wert: ");
        String b = scanner.nextLine();
        double y = Double.parseDouble(b);
        // Operator
        System.out.print("Wähle Operator");
        System.out.println("Gültige Werte (+, -, *, /, %");
        String input = scanner.nextLine();

        if (input.equals("+")) {
            double z = x + y;
            System.out.println("Die Summe aus x + y = " + z);
        } else if (input.equals("-")) {
            double z = x - y;
            System.out.println("Die Differenz aus x - y = " + z);
        } else if (input.equals("*")) {
            double z = x * y;
            System.out.println("Das Produkt aus x * y = " + z);
        } else if (input.equals("/")) {
            if(y != 0) {
                double z = x / y;
                System.out.println("Der Quotient aus x / y = " + z);
            } else {
                System.out.println("Division durch 0 ist nicht möglich");
            }

        } else if (input.equals("%")) {
            double z = x % y;
            System.out.println("Das Ergebnis aus x % y = " + z);
        }
        else
            System.out.println("Invalide Eingabe");
    }

}