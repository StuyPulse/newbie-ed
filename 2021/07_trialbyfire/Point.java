/*
1: mark
variables:
x
y

2: ben
Point(x, y)
Point(p)

3: anthony
toString()

4: Shaurya
getX()
getY()

5: randy
setX(new x)
setY(new y)

later:
* distanceBetween(p1, p2)
distanceTo(other)

*/

public class Point {

//1:
    private double x;
    private double y;
    
//2:
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        x = p.getX();
        y = p.getY();
    }

    public Point() {
        this(0, 0);
    }

//3:
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
//4:
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    

//5: <================================================================>
    /* 
     * sets the x variable
     * 
     * @param x new x value
     */
    public void setX (double x) {
        this.x = x;
    }
    public void setY (double y) {
        this.y = y;
    }

// last part:
    public double distanceTo(Point other) {
        // sqrt((x2-x1)^2 + (y2-y1)^2)
        return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
    }

    public static double distanceBetween(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}