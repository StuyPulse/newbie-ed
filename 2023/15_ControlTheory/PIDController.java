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
    public double getkP() {
        return kP;
    }
    public double getkI() {
        return kI;
    }
    public double getkD() {
        return kD;
    }

    //you don't make setters for PID constants because you don't want them to change

    //PID controller's getOutput method
    @Override
    public double getOutput(double error) {
        double p = kP * error;
        double i = kI * integral(error);
        double d = kD * deriviative(error);
        return p + i + d;
    }

    //integral will basically find the sum of all the errors over time (area under the curve), which I simplified to error * dt
    public double integral(double error) {
        return error * this.dt;
    }

    //deriviative will find the slope of the line between the current error and the previous error, which I simplified to error / dt
    public double deriviative(double error) {
        return error / this.dt;
    }
}
