import java.util.Arrays;

public class Zug {
    private float momentaneGeschwindigkeit = 0; // in km/h
    private float maximalGeschwindigkeit = 150;
    private Waggon[] waggone;
    //private int momentaneAnzahlWaggone = 0;

    public Zug(float maximalGeschwindigkeit, int maximumAnzahlWaggone) {
        this.maximalGeschwindigkeit = maximalGeschwindigkeit;
        this.waggone = new Waggon[maximumAnzahlWaggone];
    }

    public void beschleunigen(float deltaGeschwindigkeit) {
        if (momentaneGeschwindigkeit + deltaGeschwindigkeit > maximalGeschwindigkeit) {
            momentaneGeschwindigkeit = maximalGeschwindigkeit;
            System.out.println("Maximalgeschwindigkeit erreicht.");
            return;
        }
        this.momentaneGeschwindigkeit += deltaGeschwindigkeit;
        System.out.println("Zug beschleunigt auf " + this.momentaneGeschwindigkeit + "km/h");
    }

    public void bremsen(float deltaGeschwindigkeit) {
        if (momentaneGeschwindigkeit - deltaGeschwindigkeit < 0) {
            momentaneGeschwindigkeit = 0;
            System.out.println("Zug steht still");
            return;
        }
        this.momentaneGeschwindigkeit -= deltaGeschwindigkeit;
        System.out.println("Zug bremst auf " + this.momentaneGeschwindigkeit + "km/h");
    }

    public void waggonAnkoppeln() {
        int momentaneAnzahlWaggone = getWaggonCount();
        if(momentaneAnzahlWaggone == waggone.length) {
            System.out.println("Waggon Limit erreicht");
        } else {
            Waggon waggon = new Waggon(Waggon.Typ.GUETER, 100);
            waggone[momentaneAnzahlWaggone] = waggon;
            //momentaneAnzahlWaggone++;
        }
    }

    public void waggonAbkoppeln() {
        int momentaneAnzahlWaggone = getWaggonCount();
        if(momentaneAnzahlWaggone == 0) {
            System.out.println("Es kann kein weiterer Waggon abgekoppelt werden.");
        } else {
            waggone[momentaneAnzahlWaggone - 1] = null;
           // momentaneAnzahlWaggone--;
        }
    }

    public void printWaggone() {
        System.out.println(Arrays.toString(waggone));
    }

    private int getWaggonCount() {
        int counter = 0;
        for(Waggon waggon : waggone) {
            if(waggon != null) {
                counter++;
            }
        }
        return counter;
    }
}
