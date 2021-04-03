public class Main {
    public static void main(String[] args) {
        int[] hoehenMeter = { 0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0 };

        int maximum = 0;
        // Maximum suchen
        for(int i = 0; i < hoehenMeter.length; i++) {
            if(hoehenMeter[i] > maximum){
                maximum = hoehenMeter[i];
            }
        }
        System.out.println("Das Maximum ist: " + maximum);

        for(int i = 0; i <= maximum; i++) {
            System.out.print(maximum-i);
            for(int j = 0; j < hoehenMeter.length; j++) {
                if(hoehenMeter[j] == maximum - i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
