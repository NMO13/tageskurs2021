import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner palindrominput = new Scanner(System.in);
        System.out.println("Teste ob ein Wort ein Palindrom ist:");
        String palindrom = palindrominput.nextLine();

        int p = palindrom.length();
        int n = palindrom.length() - 1;
        boolean ispalindrom = true;

        System.out.println("Algorithmus1 mit continue");
        for (int i = 0; i < p; i++, n--) {
            if (palindrom.charAt(i) == palindrom.charAt(n)) {
                continue;
            } else {
                ispalindrom = false;
                break;
            }
        }
        if (ispalindrom) {
            System.out.println(palindrom + " ist ein Palindrom");
        } else {
            System.out.println(palindrom + " ist kein Palindrom");
        }

        System.out.println();
        System.out.println("Algorithmus2 ohne continue");
        for (int i = 0; i < palindrom.length(); i++) {
            if (palindrom.charAt(i) != palindrom.charAt(p - 1 - i)) {
                ispalindrom = false;
                break;
            }
        }
        if (ispalindrom) {
            System.out.println(palindrom + " ist ein Palindrom");
        } else {
            System.out.println(palindrom + " ist kein Palindrom");
        }
        }
    }
