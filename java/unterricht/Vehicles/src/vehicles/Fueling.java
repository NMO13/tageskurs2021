package vehicles;

public abstract class Fueling extends WheeledVehicle{
    public Fueling(int numPersons, float weight, int numWheels, boolean isAutomatic) {
        super(numPersons, weight, numWheels, isAutomatic);
    }

    public Fueling(float weight, int numWheels, float wheelDiameter, float wheelWheight) {
        super(weight, numWheels, wheelDiameter, wheelWheight);
    }
    abstract void fuel(int liter);
}
