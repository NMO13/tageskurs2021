public class Main {
    public static void main(String[] args) {
        // new audi object
        Car audi = new Car(2020, "Black", "1234" , "A4");
        audi.drive();
        System.out.println("Car was manufactured at: " + audi.manufacturingYear);


        // new bmw object
        Car bmw = new Car(2016 ,"Red", "9383", "i8");
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println("Car was manufactured at: " + bmw.manufacturingYear);

        // new KTM
        Motorbike ktm = new Motorbike();

        // create new bicycle
        Bicycle bicycle1 = new Bicycle(50, "Scott", "Red", false);
        bicycle1.accelerate();

        // create new bicycle
        Bicycle bicycle2 = new Bicycle(50, "Scott", "Red", true);
        bicycle2.accelerate();
        bicycle2.shiftGears();

        Rectangle rectangle1 = new Rectangle(30, 40);
        Rectangle rectangle2 = new Rectangle(40, 20);
        boolean isFitting = rectangle1.fitsInto(rectangle2);
        System.out.println(isFitting);
        int area = rectangle1.calcArea();
        System.out.println(area);

        // change border radius as soon as we change the height
        // call setters and getters
        rectangle1.setHeight(60);
        rectangle2.setHeight(90);
        int h = rectangle2.getHeight();
        System.out.println(h);

        rectangle2.setWidth(50);
        System.out.println(rectangle2.getWidth());
    }
}
