// Assignment 1
// Erzeuge ein neues Projekt "Assignment1" und kopiere diese Datei in das Projekt.
// Der Code in diese Datei ist ausführbar, d.h. du solltest keine Compiler-Fehler bekommen.
// Dieses Assigment besteht aus 5 Aufgaben. Jeder Aufgabe kann unabhängig von den anderen Aufgaben gelöst werden.
// Bei den meisten Aufgabe stehen Tipps, die dir bei der Lösung helfen sollten.
public class Main {
    public static void main(String[] args) {
        ////// Exercise 1: Erstellung einer Zahlenfolge
        System.out.println("##### Exercise 1");
        // Folgende Zahlenfolge soll auf dem Terminal ausgegeben werden:
        // 1 3 5 7 9 11 13 15 17

        // Tipp: mit System.out.print() wird in der momentanen Ausgabezeile weitergeschrieben
        //       mit System.out.println() wird ein Zeilenumbruch durchgeführt und somit in eine neue Zeile geschrieben.
        System.out.print("a");
        System.out.print("b");
        // Ausgabe: ab

        System.out.println("a");
        System.out.println("b");
        // Ausgabe: a
        //          b



        ////// Exercise 2: Arbeiten mit Datentypen
        System.out.println("##### Exercise 2");
        int a = 1;
        String b = "2";
        float c = 3.f, d = 4.f;
        // Berechne:
        // float e = a * c;
        // float h = a * b + c * d;
        // int f = a + b + c + h;
        // Tipp: Achte auf korrekte Typkonvertierung.
        // Ein float kann nach int folgendermaßen konvertiert werden:
        int g = (int) c;
        System.out.println(g);


        ////// Exercise 3:
        System.out.println("##### Exercise 3");
        String text1 = "Das ist ein gewöhnlicher String";
        // Iteriere mit einer Schleife über den String.
        // Gib den gleichen String auf dem Terminal aus, jedoch ohne
        // den Buchstaben 'i'. Das bedeutet, dass das Ergebnis folgendermaßen aussehen muss:
        // Das st en gewöhnlcher Strng


        // Tipps:
        // Mit text.length() kannst du die Länge des Texts bekommen:
        System.out.println(text1.length());

        // mit text.charAt(i) kannst du das Zeichen an Position i erhalten
        // Beispiele: char c = text.charAt(10) gibt 'n' zurück und speichert das
        // Zeichen in c.
        System.out.println(text1.charAt(10));
        // Der Datentyp char repräsentiert ähnlich wie String Text. Der Unterschied
        // ist, dass char NUR EIN ZEICHEN speichert.

        ////// Exercise 4:
        System.out.println("##### Exercise 4");
        // Iteriere mit einer Schleife über folgenden Text
        // und stoppe die Schleife (mittels break), sobald das Zeichen
        // 'u' gefunden wurde.
        // Das Ergebnis muss folgendermaßen aussehen:
        // Das ist ein k
        String text2 = "Das ist ein kurzer Text";


        ////// Exercise 5:
        System.out.println("##### Exercise 5");
        // Erzeuge auf der Konsole folgendes Muster:
        // 1 4 6
        // 8 10 12
        // 14 16 18
        // Tipp: Du kannst das mit einer Schleife oder zwei
        //       ineinander geschachtelten Schleifen lösen


    }
}
