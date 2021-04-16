public class Zug {
    float momentaneGeschwindigkeit = 0; // in km/h

    public void beschleunigen(float deltaGeschwindigkeit) {
        this.momentaneGeschwindigkeit += deltaGeschwindigkeit;
        System.out.println("Zug beschleunigt auf " + this.momentaneGeschwindigkeit + "km/h");
    }
}
