public class Triangle extends Polygon{

    public Triangle(Point[] points) throws Exception{
        super(points);
        if(points.length > 3) {
            throw new Exception("Ein Dreieck hat genau 3 Punkte");
        }
        // this bezieht sich auf aktuelle Klasse (in dem Fall Triangle)
        // super bezieht sich auf Parent Klasse (in dem Fall Polygon)
    }

}
