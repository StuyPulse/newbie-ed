public class Triangle{ 
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public String toString() {
        return v1.toString() + v2.toString() + v3.toString();
    }

    public double getPerimeter() {
        return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
    }

    public Point getVertex(int n) {
        switch(n) {
            case 1:
                return v1;
            case 2:
                return v2;
            case 3:
                return v3;
            default:
                return null; 
        }

    }

    public void setVertex(int n, Point p) {
        switch(n) {
            case 1:
                v1 = p;
                break;
            case 2:
                v2 = p;
                break;
            case 3:
                v3 = p;
                break;
            default:
                break;
        }
    }




}

