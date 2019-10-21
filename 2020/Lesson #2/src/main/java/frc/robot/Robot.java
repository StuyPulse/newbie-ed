/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  private WPI_VictorSPX shooterMotor;

  @Override
  public void robotInit() {
    //makes new motor at port 13
    shooterMotor = new WPI_VictorSPX(13);

    //inverts the motor
    shooterMotor.setInverted(true);

    //makes motor coast to a stop when given speed of 0
    //can also be set to NeutralMode.Brake to make motor stop when given speed of 0
    shooterMotor.setNeutralMode(NeutralMode.Coast);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopPeriodic() {
    //sets motor speed to 0.25
    //speed ranges from -1 to 1 (full speed backwards to full speed forwards)
    shooterMotor.set(0.25);
  }

  @Override
  public void testPeriodic() {
  }
}
