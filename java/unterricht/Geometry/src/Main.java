import addieren.*;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[8];

        // Polygon anlegen
        Polygon polygon1 = new Polygon(points);
        float x = polygon1.computeArea();
        System.out.println(x);

        // Triangle anlegen
        Triangle triangle = new Triangle(points);
        triangle.computeArea();

        A a = new A();
        // geht nicht: a.setNumber(40);
        a.addieren(6, 7);
        a.subtrahieren(9, 9);

        // Instanz (Objekt) von B
        B b = new B();
        b.addieren(9, 9);
        b.subtrahieren(3, 4);

        C c = new C();
        // geht auch nicht, da private: c.setNumber(20);
        // c.x(); // geht nicht, da protected
        c.addieren(3, 5);
        c.subtrahieren(8, 9);
        c.setNumber1(4);

        A a1 = new C();
        a1.addieren(3, 5);

        // Advanced
        addieren(a1);
        addieren(a);
        addieren(b);
        addieren(c);

        D d = new D();
        addieren(d);
    }

    // Framework, wie Angular, Swing, ....
    public static void addieren(A aObjekt) {
        System.out.println("Mach was cooles");
        aObjekt.addieren(4, 6);
    }
}
