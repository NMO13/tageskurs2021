package vehicles;

public abstract class Vehicle implements GPSCoordinates {
    protected int numPersons;
    protected float weight;
    protected int totalKilometers;
    private Position position = new Position();

    public Vehicle(int numPersons, float weight) {
        this.numPersons = numPersons;
        this.weight = weight;
    }

    protected void setPosition(int km) {
        this.position.x += km;
    }

    @Override
    public Position localize() {
        return position;
    }

    public abstract void drive(int km);

    public void maintainance() {
        System.out.println("Repair vehicle");
    }

    public int getTotalKilometers() {
        return totalKilometers;
    }
}
