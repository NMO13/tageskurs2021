public class LKW extends WheeledVehicle {
    private float loadCapacity;

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public LKW(float loadCapacity, float weight) {
        super(3, weight, 8, false);
        this.loadCapacity = loadCapacity;
    }
}
