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
}
