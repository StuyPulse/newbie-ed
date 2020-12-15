/* Task: Make Triangle Class
*  Constructor Specs: 
*       1) Take in six numbers (each pair) representing the coordinates of the triangle's vertices
*       2) Take in three points representing the triangle's vertices
*
*   Method headers from the README:
*      Triangle(p1, p2, p3)
*      Triangle(x1, y1, x2, y2, x3, y3)
*      toString()
*      getPerimeter()
*      getVertex(n)
*      setVertex(n, p)
*/

public class Triangle {
    // Points associated with the triangle
    Point p1;
    Point p2;
    Point p3;
    

    public Triangle(Point p1, Point p2, Point p3) {
        // note: this.[var] refers to the variables of the class
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
    }
    
    public String toString() {
        String vertices = "Triangle: " + p1 + ", " + p2 + ", " + p3;
        return vertices;
        
    }   

    public double getPerimeter(Point p1, Point p2, Point p3) {
        return Point.distanceBetween(p1, p2) + Point.distanceBetween(p2, p3) + Point.distanceBetween(p1, p3); 
    }
    
    public Point getVertex(int n) {
        if (n == 0) {
            return p1;
        }
        if (n == 1) {
            return p2;
        }
        if (n == 2) {
            return p2;
        }
        
        return null;
    }
    
    public void setVertex(int n, Point p) {
        if (n == 0) {
            p1 = p;
        }
        if (n == 1) {
            p2 = p;
        }
        if (n == 2) {
            p3 = p;
        }
    }
}