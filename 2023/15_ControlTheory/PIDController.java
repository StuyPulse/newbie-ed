public class PIDController extends Controller {
    //PID constants
    private final double kP;
    private final double kI;
    private final double kD;
    
    public PIDController(double kP, double kI, double kD) {
        super();
        this.kP = kP;
        this.kI = kI;
        this.kD = kD;
    }

    //getters for PID constants
    public getkP() {
        return kP;
    }
    public getkI() {
        return kI;
    }
    public getkD() {
        return kD;
    }

    //you don't make setters for PID constants because you don't want them to change

    //PID controller's getOutput method
    public double getOutput(double error, double dt) {
        double p = kP * error;
        double i = kI * integral(error, dt);
        double d = kD * deriviative(error, dt);
        return p + i + d;
    }

    //integral will basically find the sum of all the errors over time (area under the curve), which I simplified to error * dt
    public double integral(double error, double dt) {
        return error * dt;
    }

    //deriviative will find the slope of the line between the current error and the previous error, which I simplified to error / dt
    public double deriviative(double error, double dt) {
        return error / dt;
    }
}
