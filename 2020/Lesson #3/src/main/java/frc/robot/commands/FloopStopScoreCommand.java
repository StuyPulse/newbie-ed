/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class FloopStopScoreCommand extends CommandGroup {

  public FloopStopScoreCommand() {
    addSequential(new FloopPullCommand());
    addSequential(new WaitCommand(0.25)); //adds a pause between these two commands
    addSequential(new FloopOpenCommand());
  }
}
