public class Main {
    public static void main(String[] args) {
        // BEISPIEL Fibonacci Zahlen
        int count = 10;
        System.out.println("The first " + count + " Fibonacci numbers are:");
        int n0 = 0;
        int n1 = 1;
        System.out.println(n0);
        System.out.println(n1);

        for(int i = 0; i < count - 2; i++){
            int n3 = n0 + n1;
            System.out.println(n3);
            n0 = n1;
            n1 = n3;
        }

        // Variante mit nur einer Ausgabe
        n0 = 0;
        n1 = 1;
        System.out.println("Variante mit einer Ausgabe");
        for(int i = 0; i < count; i++) {
            int n3  = n0 + n1;
            System.out.println(n0);
            n0 = n1;
            n1 = n3;
        }

    }
}
