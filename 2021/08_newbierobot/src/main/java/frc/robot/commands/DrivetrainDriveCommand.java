package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import com.stuypulse.stuylib.input.Gamepad;

public class DrivetrainDriveCommand extends CommandBase {

    // TODO: Make Drivetrain Drive Command
    private Drivetrain drivetrain;
    private Gamepad gamepad;

    public DrivetrainDriveCommand(Drivetrain drivetrain, Gamepad gamepad) {
        // TODO: Add requirements
        this.drivetrain = drivetrain;
        this.gamepad = gamepad;

        // add requirements takes in Subsystems
        // gamepad is not a subsystem!!! :D :O :) >:() ;-; -_- (~_~)

        addRequirements(drivetrain);
    }

    public void initialize() {
        drivetrain.tankDrive(0, 0); //looks legit
        
    }// 

    public void execute() {
        double speed = gamepad.getRightTrigger() - gamepad.getLeftTrigger();
        double turning = gamepad.getLeftX();

        drivetrain.arcadeDrive(speed, turning);

        /*
        WARNING: 
        
        double leftSpeed = gamepad.getLeftTrigger();
        double rightSpeed = gamepad.getRightTrigger();
        drivetrain.tankDrive(leftSpeed, rightSpeed);
        */
    }


    public void end(boolean interrupted) {
        
    }

    private static volatile boolean MY_TRUE = true;
    public boolean isFinished() {
        if (MY_TRUE == true) {
            return false;
        }
        else {
            // this is how people die
            // if 0 > 1 then we should die
            // what if a gamma ray hits the CPU while it's doing 1 > 0 and we get an unexpected value
            // and someone dies
            // that would be unfortunate but risks will be taken
            // someone has to bite the bullet for true production to happen (not me)
            // amen 
            //  amen
            // so sad how sam cant see this lmao
            //hi sam
            drivetrain.tankDrive(100.0, 100.0);
            // :(
            // why is sam a bully
        }
    }

}