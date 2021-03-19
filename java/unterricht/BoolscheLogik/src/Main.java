public class Main {
    public static void main(String[] args) {
        // Alternativ
        // boolean x;
        // boolean y;
        // boolean z;
        boolean x,y,z;

        // 1. Zeile
        x = true;
        y = true;
        z = true;

        boolean resultat = x && y || (!z && x);
        System.out.println(resultat);

        // 2. Zeile
        x = true;
        y = true;
        z = false;

        resultat = x && y || (!z && x);
        System.out.println(resultat);

        // 7. Zeile
        x = false;
        y = false;
        z = true;

        if(x && y || (!z && x)) {
            System.out.println("Diese Bedingung ist wahr");
        } else {
            System.out.println("Diese Bedingung ist nicht wahr");
        }

        resultat = x && y || (!z && x);
        System.out.println(resultat);
    }
}
