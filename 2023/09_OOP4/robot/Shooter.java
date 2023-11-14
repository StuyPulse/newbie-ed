package robot;
public class Shooter extends AbstractRobot {
    private double shooterSpeed;
    private double hoodAngle;

    // Constructor for Shooter class
    public Shooter(String teamName, int teamNumber, double shooterSpeed, double hoodAngle) {
        super(teamName, teamNumber);
        this.shooterSpeed = shooterSpeed;
        this.hoodAngle = hoodAngle;
    }

    public double getShooterSpeed() {
        return shooterSpeed;
    }
    public void setShooterSpeed(double shooterSpeed) {
        this.shooterSpeed = shooterSpeed;
    }
    public double getHoodAngle() {
        return hoodAngle;
    }
    public void setHoodAngle(double hoodAngle) {
        this.hoodAngle = hoodAngle;
    }
}