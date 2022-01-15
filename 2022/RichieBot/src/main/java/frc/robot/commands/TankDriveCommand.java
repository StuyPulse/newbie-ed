package frc.robot.commands;

import com.stuypulse.stuylib.input.Gamepad;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RomiDrivetrain;

public class TankDriveCommand extends CommandBase {
    private RomiDrivetrain andrew;
    private Gamepad driver;

    public TankDriveCommand(RomiDrivetrain driveTrain, Gamepad gamepad)
    {
        andrew = driveTrain;
        driver = gamepad;

        addRequirements(andrew);
    }

    public void execute() {
        andrew.tankDrive(
            driver.getLeftY(),
            driver.getRightY()
        );
    }

    public boolean isFinished() {
        return false;
    }
    

}
