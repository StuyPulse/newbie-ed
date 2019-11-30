/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class FloopStartScoreCommand extends CommandGroup {

  //command groups are a sequence of groups that are run in order
  //used for autons, for example
  //addSequential adds commands that will run one after the other
  //addParallel adds commands that will run together
  public FloopStartScoreCommand() {
    addSequential(new FloopCloseCommand());
    addSequential(new FloopPushCommand());
  }
}
