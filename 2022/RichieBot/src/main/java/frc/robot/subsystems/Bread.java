package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Bread extends SubsystemBase {
    private Spark wheat; // = new Spark(-1);
    private Spark flour;
    
    public Bread(){
        wheat = new Spark(0);
        flour = new Spark(1);

        flour.setInverted(true);
    }

    @Override
    public void periodic() {
    }

    public void bake(double wheatSpeed, double flourSpeed) {
        wheat.set(wheatSpeed);
        flour.set(flourSpeed);
    }

    public void fry(double wheatness, double flourness){
        bake(
            wheatness+flourness,
            wheatness-flourness
        );
    }

    public void freeze() {
        wheat.set(0.0);
        flour.set(0.0);
    }
}
