import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        ////// Exercise 1: Multiplikative Kette
        // Implementiere eine Funktion, welche die Länge einer multiplikativen
        // Kette entgegen nimmt, diese Kette berechnet und das Ergebnis
        // zurückliefert.
        // Eine multiplikative Kette ist das Produkt mehrer aufsteigender Faktoren.
        // Beispiele:
        // z.B:
        // Eine multiplikative Kette mit der Länge 2 hat folgende Form:
        // 1 * 2 = 2
        // Eine multiplikative Kette mit der Länge 3 hat folgende Form:
        // 1 * 2 * 3 = 6
        // Eine multiplikative Kette mit der Länge 5 hat folgende Form:
        // 1 * 2 * 3 * 4 * 5 = 120
        // Eine multiplikative Kette mit der Länge 1 hat folgende Form:
        // 1 = 1
        // Spezialfall: Das Ergebnis einer multiplikativen Kette mit der
        // Länge 0 ist immer 1!

        // Funktionsaufruf Beispiele:
        // z = multChain(3)
        // System.out.println(z)
        // Ausgabe: 6

        // z = multChain(0)
        // System.out.println(z)
        // Ausgabe: 1

        // z = multChain(5)
        // System.out.println(z)
        // Ausgabe: 120
        // Tipp: Der Datentyp ist immer int

        int z = multChain(5);
        System.out.println(z);


        z = multChain(0);
        System.out.println(z);


        ////// Exercise 2: String replacement
        // namen und namenNeu sind Zeiger auf das gleiche Array
        String[] namen = {"Marc", "Andreas", "Georg", "Michael", "Georg"};
        String[] namenNeu = replace(namen, "Georg", "Simon");
        System.out.println(Arrays.toString(namen)); // namen hat sich auch geändert
        System.out.println(Arrays.toString(namenNeu));
        // Schreibe eine Funktion, die alle Vorkommen von
        // einem Namen durch einen Anderen ersetzt.
        // z.B:
        // names = replace(names, "Marc", "Max")
        // System.out.println(names);
        // Ergebnis: ["Max", "Andreas", "Georg", "Michael", "Georg"]
        // z.B:
        // names = replace(names, "Georg", "Simon")
        // System.out.println(Arrays.toString(names));
        // Ausgabe: ["Marc", "Andreas", "Simon", "Michael", "Simon"]
        // Tipp: Ein Array kann folgendermaßen als Funktionsparameter
        // angegeben werden: void foo(String[] array) { }

        // Exercise 3: Palindrom
        String text = "AbbA";
        // Schreibe eine Funktion palindrom, welche das Palindrom eines
        // Strings berechnet.
        // Die Funktion wird folgendermaßen aufgerufen:
        // boolean isPalindrom = palindrom(text);
        // System.out.println(isPalindrom);
        // Ausgabe: true

        boolean isPalindrom = palindrom(text);
        if (isPalindrom) {
            System.out.println(text + " ist ein Palindrom");
        } else {
            System.out.println(text + " ist kein Palindrom");
        }
    }

    static int multChain(int length) {
        int output = 1;
        for(int i = 0; i < length; i++) {
            output = output * (i+1);
        }
//        if(length == 0) {
//            return 1;
//        }
//        else {
//            for(int i = 1; i < length + 1; i++) {
//                output = output * i;
//            }
//        }
        return output;
    }

    static String[] replace(String[] namenArr, String zuErsetzen, String ersetzenDurch) {
        for(int i = 0; i < namenArr.length; i++) {
            if(namenArr[i].equals(zuErsetzen)) {
                namenArr[i] = ersetzenDurch;
            }
        }
        return namenArr;
    }

    static boolean palindrom(String palindrom) {
        boolean ispalindrom = true;
        int p = palindrom.length();
        for (int i = 0; i < palindrom.length(); i++) {
            if (palindrom.charAt(i) != palindrom.charAt(p - 1 - i)) {
                ispalindrom = false;
                break;
            }
        }
        return ispalindrom;
    }


}