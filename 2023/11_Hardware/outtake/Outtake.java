//copy pasted from our activities today, can be placed in Jim's subsystems folder to see work
package com.stuypulse.robot.subsystems.outtake;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Outtake extends SubsystemBase {
    private CANSparkMax backMotor;

    private Encoder encoder;

    private double targetOuttakeSpeed;

    public Outtake() {
        backMotor = new CANSparkMax(1, CANSparkMax.MotorType.kBrushless);
        encoder = new Encoder(0, 1);
        targetOuttakeSpeed = 0.0;
    }

    public void setOutTakeSpeed(double outtakeSpeed) {
        backMotor.set(targetOuttakeSpeed);
    }

    public double getOuttakeSpeed() {
        return backMotor.get();
    }

    public void setTargetOutTakeSpeed(double targetOutTakeSpeed) {
        this.targetOuttakeSpeed = targetOutTakeSpeed;
    }

    public double getTargetOutTakeSpeed() {
        return this.targetOuttakeSpeed;
    }
}
