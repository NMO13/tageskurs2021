public class Bicycle {
    int wheelDiameter; // in cm
    String brand;
    String color;
    boolean isElectric;

    public Bicycle(int wD, String b, String c, boolean iE) {
        wheelDiameter = wD;
        brand = b;
        color = c;
        isElectric = iE;
    }

    public void ride() {

    }

    public void accelerate() {
        if(isElectric)
            System.out.println("Fast acceleration");
        else
            System.out.println("Slow accelleration");
    }

    public void shiftGears() {
        if(isElectric)
            System.out.println("Cannot shift gears");
        else
            System.out.println("Change gear");
    }

    public void brake() {
    }
}
