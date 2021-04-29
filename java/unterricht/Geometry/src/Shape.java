import java.util.Arrays;

public abstract class Shape implements Operations {
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

    @Override
    public void move(int x, int y) {
        System.out.println("Move shape to " + x + " and " + y);
    }

    @Override
    public void rotate(int degree) {
        System.out.println("Rotate shape around " + degree + "°");
    }
}
