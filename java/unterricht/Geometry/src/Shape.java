import java.util.Arrays;

public abstract class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    abstract float computeArea();

    public String getPointsAsString() {
        return Arrays.toString(this.points);
    }
}
