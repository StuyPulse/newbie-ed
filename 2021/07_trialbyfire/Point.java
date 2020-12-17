/* 
Constructors:
Point(x, y)
Point(p)

Methods:
toString()
getX()
getY()
setX(new x)
setY(new y)
* distanceBetween(p1, p2)
distanceTo(other)*/


public class Point {
  	private double x;
  	private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void setX(double n) {
        x = n;
    }
    
    public void setY(double m) {
        y = m;
    }
   
    public static double distanceBetween(Point p1, Point p2){        
        return Math.sqrt(((p1.getX()-p2.getX())*(p1.getX()-p2.getX()))+((p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
        // return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    
    public double distanceTo(Point other) {
        // hint: you can use distanceBetween() with two points, what two points do we have in this method?
        return distanceBetween(this, other);
    }
    
    // when you use System.out.println(Point), Point gets replaced by what toString() returns.
    public String toString(){
        String point = "point = (" + x + "," + y + ")";
        return point;
    }
}