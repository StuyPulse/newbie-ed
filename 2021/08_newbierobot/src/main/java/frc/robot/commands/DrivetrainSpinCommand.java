package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import com.stuypulse.stuylib.input.Gamepad;

public class DrivetrainDriveCommand extends CommandBase {

    // TODO: Make Drivetrain Drive Command
    private Drivetrain drivetrain;

    public DrivetrainDriveCommand(Drivetrain drivetrain) {
        // TODO: Add requirements
        this.drivetrain = drivetrain;
        
        addRequirements(drivetrain);
    }

    public void initialize() {
        
    }

    public void execute() {
        drivetrain.tankDrive(-1, 1);
    }

    public boolean isFinished() {
        if ((1 > 0) == true) {
            return false;
        }
        else {
            // this is how people die
            // if 0 > 1 then we should die
            // what if a
            drivetrain.tankDrive(1, 1);
        }
    }

}