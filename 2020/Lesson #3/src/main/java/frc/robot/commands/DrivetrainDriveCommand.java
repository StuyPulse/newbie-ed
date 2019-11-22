package frc.robot.commands;

import frc.robot.Command;
import frc.robot.Robot;

public class DrivetrainDriveCommand implements Command {

    @Override
    public void execute() {
        //keeps updating tankdrive values with gamepad joystick values
        Robot.drivetrain.tankDrive(Robot.gamepad.getLeftY(), Robot.gamepad.getRightY());
    }

    @Override
    public void end(boolean interrupted) {
        //stops robot at the end of this command
        Robot.drivetrain.tankDrive(0.0, 0.0);
    }

}