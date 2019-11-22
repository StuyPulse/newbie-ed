/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.Drivetrain;
import frc.util.Gamepad;

public class Robot extends TimedRobot {

  public static Drivetrain drivetrain;
  public static Gamepad gamepad; //temporary

  @Override
  public void robotInit() {
    //creates new instance of Drivetrain object
    drivetrain = new Drivetrain();

    //makes new gamepad for now
    gamepad = new Gamepad(0);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    //calls tankDrive method on drivetrain
    //this is the method we made in Drivetrain.java, not the one for DifferentialDrive
    drivetrain.tankDrive(0.5, 0.5);

    //prints out the current tick count from the encoder
    //again, this is using the method made in Drivetrain.java
    System.out.println(drivetrain.getEncoderTicks());
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void testPeriodic() {
  }
}
