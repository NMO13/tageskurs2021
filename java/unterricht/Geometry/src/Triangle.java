public class Triangle extends Polygon{

    public Triangle(Point[] points) {
        super(points);
        // this bezieht sich auf aktuelle Klasse (in dem Fall Triangle)
        // super bezieht sich auf Parent Klasse (in dem Fall Polygon)
    }
}
