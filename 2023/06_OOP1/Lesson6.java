public class Lesson6 {
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(420, 694);
        Point c = new Point(0, 4);

        Triangle t = new Triangle(a, b, c);
        System.out.println(t.getPerimeter());
        System.out.println(t.getArea());

    }   
}

//JUST FOR DEMO, THESE ARE IN THE SAME FILE BUT EACH CLASS SHOULD BE ITS OWN FILE
class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y; 
    }
    static double getDistance(Point point, Point toPoint) {
        return Math.sqrt(Math.pow(point.x - toPoint.x, 2) + Math.pow(point.y - toPoint.y, 2));
    }
}


class Triangle {
    Point a;
    Point b;
    Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getPerimeter() {
        return Point.getDistance(this.a,this.b) + Point.getDistance(this.b,this.c) + Point.getDistance(this.c,this.a);
    }
    double getArea() {
        return 0.5 * Math.abs((a.x - c.x) * (b.y - c.y) - (b.x - c.x) * (a.y - c.y));
    }
}


