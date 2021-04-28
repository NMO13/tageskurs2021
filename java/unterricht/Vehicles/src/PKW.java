public class PKW extends WheeledVehicle{
    private int numSeats;

    public PKW(int numPersons, float weight, boolean isAutomatic, int numSeats) {
        super(numPersons, weight, 4, isAutomatic);
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }
}
