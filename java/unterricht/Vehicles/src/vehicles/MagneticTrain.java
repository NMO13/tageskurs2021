package vehicles;

public class MagneticTrain extends Vehicle {
    private float powerConsumption;

    public MagneticTrain(int numPersons, float weight, float powerConsumption) {
        super(numPersons, weight);
        this.powerConsumption = powerConsumption;
    }
    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void drive(int km) {
        System.out.println("Magnetic train hovers");
        //totalKilometers = totalKilometers + km;
        totalKilometers += km;
    }
}
