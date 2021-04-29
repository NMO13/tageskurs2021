import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Polygon extends Shape {
    public Polygon(Point[] points) {
        super(points);
    }

    @Override
    float computeArea() {
        /*
        Nicht korrekte Implementierung der Polygonsumme
         */
        float sum = 0;
        for(Point p : this.getPoints()) {
            sum += p.x * p.y;
        }
        return sum;
    }

    public void move(int x, int y) {

    }

    public void rotate(int degree) {

    }
}
