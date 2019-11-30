/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Floop;
import frc.util.Gamepad;

public class Robot extends TimedRobot {

  public static Drivetrain drivetrain;
  public static Floop floop;
  public static OI oi;

  @Override
  public void robotInit() {
    //creates new instance of Drivetrain object
    drivetrain = new Drivetrain();

    floop = new Floop();

    //makes new instance of OI (where buttons are connected with commands)
    oi = new OI();

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
    //prints out the current tick count from the encoder
    //this is using the method made in Drivetrain.java
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
