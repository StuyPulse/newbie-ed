/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

impoSrt edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;


// Import all the commands and subsystems
import frc.robot.commands.*;
import frc.robot.commands.autos.*;
import frc.robot.subsystems.*;
//lag
import com.stuypulse.stuylib.input.gamepads.*;
import com.stuypulse.stuylib.input.Gamepad;

/**
 * This is where the majority of the robot code is going to be created.
 *     
 * All button binds and commands are initialized here
 */
public class RobotContainer {

   // Create new driver gamepad connected to port 0
    private Gamepad driver = new PS4(0);

    // TODO: Make the subsystems
    private Shooter shooter = new Shooter();
    private Drivetrain drivetrain = new Drivetrain(); 

    /**
     * Run at creation
     */
    public RobotContainer() {
        configureDefaultCommands();
        configureButtonBindings();
        configureSmartDashboard();
    }

    /**
     * Creates default commands for everything to run
     */
    private void configureDefaultCommands() {
        //TODO: Make default commands
        //TODO: write useful comments
        drivetrain.setDefaultCommand(new DrivetrainDriveCommand(drivetrain, driver));
       
        
    }

    /**
     * Creates button bindings for gamepad
     * 
     * ( contains a useful comment )   
     */
    private void configureButtonBindings() {
        //TODO: make button bindings

        /**
         * BELOW:
         *  - button bindings
         *  - useful comment
         *  - the comment is useful because it is descriptive- documentation is valid work
         */ 
        /* BUTTON BINDINGS - Useful Comment */ /// <-- this is a useful comment
        /**
         * ABOVE:
         *  - button bindings
         *  - useful comment
         *  - the comment is useful because it is descriptive
         */ 
        driver.getRightButton().whenPressed(new ShooterShootCommand(shooter));
        driver.getTopButton().whenPressed(new ShooterStopCommand(shooter)); //at least try to make it ergonomic

        // why is it pressed for when and held for while
        //hmmmm         // usualy u have pressed vs held like ur mouse 
        // yeah but do you hold a button
        driver.getLeftButton().whileHeld(new DrivetrainSpinCommand(drivetrain));
    }

    // This lets us select an auton
    private static SendableChooser<Command> autonChooser = new SendableChooser<>();

    /**
     * Put every auton that we made on smart dashboard
     */
    private void configureSmartDashboard() {
        autonChooser.addOption("Do Nothing", new DoNothingAutonCommand());
        SmartDashboard.putData(autonChooser);
    }

    /**
     * This lets us return which command we want to run during auton
     */
    public Command getAutonomousCommand() {
        return autonChooser.getSelected();
    }
}
