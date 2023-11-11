public class Ball {
    private double x;
    private double y;
    private double z;

    // Constructor
    public Ball(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }

    // Methods
    public void setXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
