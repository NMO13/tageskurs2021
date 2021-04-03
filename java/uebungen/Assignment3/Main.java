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


        ////// Exercise 2: String replacement
        String[] names = {"Marc", "Andreas", "Georg", "Michael", "Georg"};
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
        // bool isPalindrom = palindrom(text);
        // System.out.println(isPalindrom);
        // Ausgabe: true


    }
}