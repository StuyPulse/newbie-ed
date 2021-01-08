/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.robot.Constants.Ports;

public class Drivetrain extends SubsystemBase {
    
    WPI_VictorSPX frontLeft = new WPI_VictorSPX(Ports.Drivetrain.FRONT_LEFT);
    WPI_VictorSPX backLeft = new WPI_VictorSPX(Ports.Drivetrain.BACK_LEFT);
    WPI_VictorSPX backRight = new WPI_VictorSPX(Ports.Drivetrain.BACK_RIGHT);
    WPI_VictorSPX frontRight = new WPI_VictorSPX (Ports.Drivetrain.FRONT_RIGHT);
    
    SpeedControllerGroup left = new SpeedControllerGroup(frontLeft,backLeft);
    SpeedControllerGroup right = new SpeedControllerGroup(frontRight,backRight);
    
    DifferentialDrive drive = new DifferentialDrive(left, right);

    public Drivetrain() {
        
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed) { 
        drive.tankDrive(leftSpeed, rightSpeed); 
    }
    
    public void arcadeDrive(double speed, double turn) { 
        drive.arcadeDrive(speed, turn); 
    }
}






