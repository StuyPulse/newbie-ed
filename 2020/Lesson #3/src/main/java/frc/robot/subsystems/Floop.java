/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Floop extends Subsystem {
  
  private Solenoid floopSolenoid;
  private Solenoid pusherSolenoid;

  public Floop() {
    floopSolenoid = new Solenoid(RobotMap.FLOOP_SOLENOID_PORT);
    pusherSolenoid = new Solenoid(RobotMap.PUSHER_SOLENOID_PORT);
  }

  @Override
  public void initDefaultCommand() {
    //no default commands for floop
  }

  public void push() {
    pusherSolenoid.set(true);
  }

  public void pull() {
    pusherSolenoid.set(false);
  }

  public void open() {
    floopSolenoid.set(true);
  }

  public void close() {
    floopSolenoid.set(false);
  }

}
