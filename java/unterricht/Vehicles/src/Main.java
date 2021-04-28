public class Main {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle(4, 4.6f);
        vehicle.maintainance();

        WheeledVehicle wheeledVehicle = new WheeledVehicle(7, 9.8f ,4, false);
        wheeledVehicle.maintainance();

        WheeledVehicle wheeledVehicle1 = new WheeledVehicle(3.4f, 6, 6.6f, 4.3f);

        PKW pkw = new PKW(5, 2000, true, 5);
        System.out.println(pkw.getNumSeats());
        pkw.maintainance();

        LKW lkw = new LKW(5000, 7000);
        System.out.println(lkw.getLoadCapacity());
        lkw.maintainance();

        BeerBicycle beerBicycle = new BeerBicycle("Mountainbike");
        System.out.println(beerBicycle.getType());
        beerBicycle.maintainance();

        MagneticTrain magneticTrain = new MagneticTrain(100, 10000, 100000);
        System.out.println(magneticTrain.getPowerConsumption());
        magneticTrain.maintainance();

    }
}
