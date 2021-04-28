public class Main {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle(4, 4.6f);
        WheeledVehicle wheeledVehicle = new WheeledVehicle(7, 9.8f ,4, false);

        WheeledVehicle wheeledVehicle1 = new WheeledVehicle(3.4f, 6, 6.6f, 4.3f);

        PKW pkw = new PKW(5, 2000, true, 5);
        System.out.println(pkw.getNumSeats());

        LKW lkw = new LKW(5000, 7000);
        System.out.println(lkw.getLoadCapacity());

        BeerBicycle beerBicycle = new BeerBicycle("Mountainbike");
        System.out.println(beerBicycle.getType());

        MagneticTrain magneticTrain = new MagneticTrain(100, 10000, 100000);
        System.out.println(magneticTrain);

    }
}
