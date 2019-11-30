/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class FloopOpenCommand extends Command {
  public FloopOpenCommand() {
    requires(Robot.floop);
  }

  @Override
  protected void initialize() {
    Robot.floop.open();
  }

  @Override
  protected boolean isFinished() {
    return true;
  }

}
