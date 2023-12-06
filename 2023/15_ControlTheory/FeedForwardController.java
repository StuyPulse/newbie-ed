public class FeedForwardController extends Controller {
    private final double kV;
    private final double kA;
    private final double kS;

    public FeedForwardController(double kV, double kA, double kS) {
        super();
        this.kV = kV;
        this.kA = kA;
        this.kS = kS;
    }

    //getters for constants
    public double getkV() {
        return kV;
    }
    public double getkA() {
        return kA;
    }
    public double getkS() {
        return kS;
    }

    //you don't make setters for constants because you don't want them to change

    //FeedForward controller's getOutput methods (notice how there are two because sometimes you don't have acceleration)
    public double getOutput(double velocity, double acceleration) {
        return kV * velocity + kA * acceleration + kS;
    }

    public double getOutput(double velocity) {
        return getOutput(velocity, 0);
    }

    //getAcceleration using the slope of the line between the current velocity and the previous velocity
    public double getAcceleration(double velocity, double dt) {
        return velocity / dt;
    }
}
