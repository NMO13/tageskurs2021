public class Main {
    public static void main(String[] args) {
        int x = 0;
        //x = x + 1;
        x++;
      //  System.out.println(x);
        x++;
      //  System.out.println(x);

        // < 7
        // äquivalent
        // <= 6
        // inkrementieren: hochzählen
        // dekrementieren: runterzählen

        System.out.println("FOR Schleife");
        int k = 0;
        for(int i = 0; i < 7; i++) {
            //System.out.println(i);
            int l = k + i;
            k = k + i;
            System.out.println(k);
        }

        System.out.println("WHILE Schleife");
        double k1 = 100;
        while(k1 > 0) {
            k1 = k1 / 5;
            System.out.println(k1);
        }

        // while is äquivalent zu:
//        for(double k1 = 100; k1 > 0; k1 = k1 / 5) {
//            System.out.println(k1);
//        }

        System.out.println("DO WHILE Schleife");
        k1 = 8;
        do {
            k1 = k1 / 2;
            System.out.println(k1);
        } while(k1 > 1);
    }
}
