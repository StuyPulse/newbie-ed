package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RomiDrivetrain;

public class DriveDistanceCommand extends CommandBase {
    private RomiDrivetrain richie;
    private double goalDistance;

    public DriveDistanceCommand(RomiDrivetrain richie, double goalDistance) {
        this.richie = richie;
        this.goalDistance = goalDistance;
        
        addRequirements(richie);
    }

    public void initialize() {
        richie.resetEncoders();
    }

    public void execute() {
        richie.tankDrive(1,1);        
    }

    public boolean isFinished() {
        if (richie.getLeftDistanceInch() < goalDistance) {
            return false;
        } else {
            return true;
        }
        // return richie.getLeftDistanceInch() > goalDistance;
    }

    public void end(boolean interrupted) {
        // richie.tankDrive(0, 0);
        richie.stop();
    }
}
