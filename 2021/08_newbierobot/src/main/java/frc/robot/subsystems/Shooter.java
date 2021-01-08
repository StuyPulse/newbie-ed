/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import frc.robot.Constants.Ports;

public class Shooter extends SubsystemBase {
    WPI_TalonSPX motor;

    public Shooter() {
       motor = new WPI_VictorSPX(Ports.SHOOTER);
    }

    public void set(double speed) {
        motor.set(speed);
    }


}
