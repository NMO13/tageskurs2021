public class Rectangle {
    private int width;
    private int height;
    private float borderRadius;

// basic getter/setter pattern
//    private String x;
//
//    public void setX(String x) {
//        this.x = x;
//    }
//
//    public String getX() {
//        return x;
//    }

    public Rectangle(int w, int h) {
        width = w;
        height = h;

        calcBorderRadius();

    }

    // setter für height
    public void setHeight(int h) {
        height = h;
        calcBorderRadius();
    }

    // getter für height
    public int getHeight() {
        return height;
    }

    // setter for width
    public void setWidth(int w) {
        width = w;
        calcBorderRadius();
    }

    // getter for width
    public int getWidth() {
        return width;
    }

    public boolean fitsInto(Rectangle otherRectangle) {
        if(width <= otherRectangle.width && height <= otherRectangle.height) {
            return true;
        }
        return false;

        // return width <= otherRectangle.width && height <= otherRectangle.height;
    }

    public int calcArea() {
        int area = width * height;
        return area;
    }

    // make private because we don't want to recalculate the border
    // radius outside of class
    private void calcBorderRadius() {
        borderRadius = (float) (width * height) / (width + height);
    }
}
