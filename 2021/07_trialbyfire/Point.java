public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        x = p.getX();
        y = p.getY();
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int args) {
        x = args;
    }

    public void setY(int args) {
        y = args;
    }
    
    public static double distanceBetween(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    
    public double distanceTo(Point other){
        return distanceBetween(this, other);
    }
    
}