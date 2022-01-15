package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RomiDrivetrain;

public class DriveForwardCommand extends CommandBase {
    private RomiDrivetrain drivetrain;
    
    public DriveForwardCommand(RomiDrivetrain drivetrain) {
        this.drivetrain = drivetrain;

        addRequirements(drivetrain);
    }

    // started:
    //  1 initialize runs once
    //  2 checks if isFinished() is true
    //  3 runs execute if not finished & goes to 2
    //  4 calls end if finished

    // initialize - runs once when command is started
    public void initialize() {
        drivetrain.stop();

    }

    // execute - runs repeatedly every 50ms until command ends
    public void execute() {
        drivetrain.tankDrive(-0.25, 0.25);
    }
    
    // isFinished - returns if command should end 
    //              (stop calling execute)
    public boolean isFinished() {
        return false;
    }

    // end
    public void end(boolean interrupted) {

    }
}
