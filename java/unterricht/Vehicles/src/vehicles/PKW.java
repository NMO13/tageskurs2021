package vehicles;

public class PKW extends Fueling {
    private int numSeats;

    public PKW(int numPersons, float weight, boolean isAutomatic, int numSeats) {
        super(numPersons, weight, 4, isAutomatic);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    // overriding a method means:
    // same return value
    // same name
    // same parameter types
    public void changeWheel() {
        System.out.println("Change wheel in vehicles.PKW.");
    }

    public void drive(int km) {
        this.setPosition(km);
        System.out.println("vehicles.PKW drives.");
        //totalKilometers = totalKilometers + km;
        totalKilometers += km;
    }

    @Override
    void fuel(int liter) {

    }

    @Override
    public int getPressure() {
        return 0;
    }
}
