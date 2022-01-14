// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RomiDrivetrain extends SubsystemBase {
    private static final double kCountsPerRevolution = 1440.0;
    private static final double kWheelDiameterInch = 2.75591; // 70 mm

    // The Romi has the left and right motors set to
    // PWM channels 0 and 1 respectively
    private final Spark m_leftMotor = new Spark(0);
    private final Spark m_rightMotor = new Spark(1);
    //
    // The Romi has onboard encoders that are hardcoded
    // to use DIO pins 4/5 and 6/7 for the left and right
    private final Encoder m_leftEncoder = new Encoder(4, 5);
    private final Encoder m_rightEncoder = new Encoder(6, 7);

    /** Creates a new RomiDrivetrain. */
    public RomiDrivetrain() {
        // Use inches as unit for encoder distances
        m_leftEncoder.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
        m_rightEncoder.setDistancePerPulse((Math.PI * kWheelDiameterInch) / kCountsPerRevolution);
        resetEncoders();
        
        // when the romi fell off the desk 
        m_rightMotor.setInverted(true);
    }

    public void arcadeDrive(double xaxisSpeed, double zaxisRotate) {

    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        this.m_leftMotor.set(leftSpeed);
        this.m_rightMotor.set(rightSpeed);
    }

    public void resetEncoders() {
        m_leftEncoder.reset();
        m_rightEncoder.reset();
    }

    public double getLeftDistanceInch() {
        return m_leftEncoder.getDistance();
    }

    public double getRightDistanceInch() {
        return m_rightEncoder.getDistance();
    }

    public void stop(){
        // m_leftMotor.set(0.0);
        // m_rightMotor.set(0.0);
        tankDrive(0.0, 0.0);
    }

}
