package vehicles;

public abstract class WheeledVehicle extends Vehicle implements TirePressure {
    protected int numWheels;
    protected float wheelDiameter;
    protected float wheelWheight;
    protected boolean isAutomatic;

    public WheeledVehicle(int numPersons, float weight, int numWheels, boolean isAutomatic) {
        super(numPersons, weight); // super must be the first instruction in the constructor
        this.numWheels = numWheels;
        this.isAutomatic = isAutomatic;
        if(numWheels < 4) {
            this.wheelDiameter = 60;
            this.wheelWheight = 2;
        } else {
            this.wheelDiameter = 49;
            this.wheelWheight = 4;
        }
    }

    // constructor overloading
    public WheeledVehicle(float weight, int numWheels, float wheelDiameter, float wheelWheight) {
        super(5, weight);
        this.numWheels = numWheels;
        this.wheelWheight = wheelWheight;
        this.wheelDiameter = wheelDiameter;
        this.isAutomatic = true;
    }

    protected void changeWheel() {
        System.out.println("Changing wheels.");
    }

    // method overriding
    public void maintainance() {
        changeWheel();
    }
}
