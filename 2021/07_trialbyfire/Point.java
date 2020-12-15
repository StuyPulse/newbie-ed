public class Point {
    private double xcor;
    private double ycor;
    
    public Point(double x, double y) {
        xcor = x;
        ycor = y;
    }

    public Point(Point p) {
        xcor = p.getX();
        ycor = p.getY();
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }  

    public double getX() {
        return xcor;
    }
    
    public double getY() {
        return ycor;
    }

    public void setX(double x) {
        xcor = x;
    }

    public void setY(double y) {
        ycor = y;
    }

    public static double distanceBetween(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + (Math.pow(p2.getY() - p1.getY(),2)));
    }

    public double distanceTo(Point other) {
        return distanceBetween(this, other);
    }
}


