public abstract class Controller {
    protected final double dt;


    public Controller() {
        this.dt = 0.02;
    }

    public Controller(double dt) {
        this.dt = dt;
    }
    
    public double getdt() {
        return dt;
    }

    public abstract double getOutput(double error);
}
