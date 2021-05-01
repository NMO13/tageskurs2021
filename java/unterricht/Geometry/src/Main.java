import addieren.*;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void rotateShape(Shape p) {
        p.rotate(56);
    }

    public static void main(String[] args) throws Exception {
        //createExampleWindow();


        int numPoints = 8;
        Point[] points = new Point[numPoints];
        for(int i = 0; i < points.length; i++) {
            Point p = new Point(i+3, i*i+4);
            points[i] = p;
        }

        // Polygon anlegen
        Polygon polygon1 = new Polygon(points);
        float x = polygon1.computeArea();
        System.out.println(x);
        polygon1.move(4, 5);
        polygon1.rotate(45);

        // Triangle anlegen
        points = new Point[3];
        points[0] = new Point(0, 0);
        points[1] = new Point(10, 0);
        points[2] = new Point(0, 10);
        System.out.println(points[0]);
        Triangle triangle = new Triangle(points);
        triangle.computeArea();
        System.out.println(triangle.getPointsAsString());

        // Noch ein Dreieck anlegen
        Triangle triangle1 = new Triangle(points[0],points[1],points[2]);
        triangle1.computeArea();
        System.out.println(triangle1.getPointsAsString());

        // Adresse von 8 Punkten von Polygon wieder in Variable points speichern
        points = polygon1.getPoints();
        System.out.println(points[3]);

        // Linie
        Line line = new Line(points[0], points[2]);

        // Kreis
        Circle circle = new Circle(points);
        System.out.println(circle.getPoints());
        circle.computeArea();

        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();
        // Shapes rotieren
        rotateShape(triangle);
        if (zahl > 3)
         rotateShape(polygon1);
        else {
            rotateShape(line);
            rotateShape(circle);
        }


        // Anderes Beispiel

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

    private static void createExampleWindow() {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);       //Display the window.
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
