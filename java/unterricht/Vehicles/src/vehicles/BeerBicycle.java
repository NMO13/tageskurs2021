package vehicles;

public class BeerBicycle extends WheeledVehicle {
    private final String MOUNTAINBIKE = "Mountainbike";
    private final String CITYBIKE = "Citybike";
    private String type;

    public BeerBicycle(String type) throws Exception {
        super(30, 8, 80, 2);
        if(!(type.equals(MOUNTAINBIKE) || type.equals(CITYBIKE))) {
            throw new Exception("Type is not correct");
        }
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void maintainance() {
        System.out.println("Repair vehicles.BeerBicycle");
    }

    public void drive(int km) {
        System.out.println("Beerbicycle drives");
        //totalKilometers = totalKilometers + km;
        totalKilometers += km;
    }

    @Override
    public int getPressure() {
        return 0;
    }
}
