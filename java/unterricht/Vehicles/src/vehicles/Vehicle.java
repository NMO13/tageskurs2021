package vehicles;

public abstract class Vehicle {
    protected int numPersons;
    protected float weight;
    protected int totalKilometers;

    public Vehicle(int numPersons, float weight) {
        this.numPersons = numPersons;
        this.weight = weight;
    }

    public abstract void drive(int km);

    public void maintainance() {
        System.out.println("Repair vehicle");
    }

    public int getTotalKilometers() {
        return totalKilometers;
    }
}
