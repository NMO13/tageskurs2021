public class Circle extends Shape {
    public Circle(Point[] points) {
        super(points);
    }

    @Override
    float computeArea() {
        float result = 0;
        for(Point point : getPoints()) {
            float x = point.x;
            result += 23;
        }
        return result;
    }
}
