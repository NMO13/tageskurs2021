public class Line extends Shape {
    public Line(Point point1, Point point2) {
        super(new Point[]{point1, point2});
    }

    @Override
    float computeArea() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Move line to " + x + " and " + y);
    }

    @Override
    public void rotate(int degree) {
        System.out.println("Rotate line around " + degree + "°");
    }
}
