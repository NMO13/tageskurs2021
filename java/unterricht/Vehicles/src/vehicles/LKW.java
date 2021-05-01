package vehicles;

public class LKW extends Fueling {
    private float loadCapacity;

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public LKW(float loadCapacity, float weight) {
        // super(weight, 8, 100, 30);
        super(3, weight, 8, false);
        this.loadCapacity = loadCapacity;
    }

    public void drive(int km) {
        System.out.println("vehicles.LKW drives.");
        //totalKilometers = totalKilometers + km;
        totalKilometers += km;
    }

    public void maintainance() {
        changeWheel();
        super.changeWheel();
        System.out.println("Repair vehicles.LKW");
    }

    public void changeWheel() {
        System.out.println("Change wheel in vehicles.LKW");
    }

    @Override
    void fuel(int liter) {

    }

    @Override
    public int getPressure() {
        return 0;
    }
}
