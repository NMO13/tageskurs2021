import vehicles.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        vehicles.Vehicle vehicle = new vehicles.Vehicle(4, 4.6f);
//        vehicle.maintainance();
//
//        vehicles.WheeledVehicle wheeledVehicle = new vehicles.WheeledVehicle(7, 9.8f ,4, false);
//        wheeledVehicle.maintainance();
//
//        vehicles.WheeledVehicle wheeledVehicle1 = new vehicles.WheeledVehicle(3.4f, 6, 6.6f, 4.3f);

        PKW pkw = new PKW(5, 2000, true, 5);
        System.out.println(pkw.getNumSeats());
        pkw.maintainance();
        pkw.drive(43);
        pkw.drive(5);
        pkw.drive(3);
        System.out.println(pkw.getTotalKilometers());
        Position p = pkw.localize();
        System.out.println(p.x);

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
