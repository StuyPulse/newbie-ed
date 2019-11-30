/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import frc.robot.commands.FloopCloseCommand;
import frc.robot.commands.FloopOpenCommand;
import frc.robot.commands.FloopPullCommand;
import frc.robot.commands.FloopPushCommand;
import frc.robot.commands.FloopStartScoreCommand;
import frc.robot.commands.FloopStopScoreCommand;
import frc.util.Gamepad;

public class OI {

  public Gamepad gamepad; 

  public OI() {

    gamepad = new Gamepad(0);

    //when each of the buttons is pressed, the corresponding command is called
    gamepad.getLeftButton().whenPressed(new FloopPushCommand());
    gamepad.getRightButton().whenPressed(new FloopPullCommand());
    gamepad.getTopButton().whenPressed(new FloopOpenCommand());
    gamepad.getBottomButton().whenPressed(new FloopCloseCommand());

    gamepad.getDPadLeft().whenPressed(new FloopStartScoreCommand());
    gamepad.getDPadRight().whenPressed(new FloopStopScoreCommand());
  }
}
