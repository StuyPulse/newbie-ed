// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.Cook;
import frc.robot.commands.DriveDistanceCommand;
import frc.robot.commands.DriveForwardCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Bread;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.RomiDrivetrain;
import edu.wpi.first.wpilibj2.command.Command;

import com.stuypulse.stuylib.input.Gamepad;
import com.stuypulse.stuylib.input.gamepads.AutoGamepad;
import com.stuypulse.stuylib.input.gamepads.Xbox;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.

 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private final RomiDrivetrain m_romiDrivetrain = new RomiDrivetrain();
    private Bread bread = new Bread();

    // https://stuypulse.github.io/StuyLib/com/stuypulse/stuylib/input/gamepads/AutoGamepad.html
    private Gamepad driver = new AutoGamepad(0);

    // private final ExampleCommand m_autoCommand = new
    // ExampleCommand(m_romiDrivetrain);

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {

        m_romiDrivetrain.setDefaultCommand(new TankDriveCommand(m_romiDrivetrain, driver));

        // Configure the button bindings
        configureButtonBindings();
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
     * it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {
        // gamepad.getButton().whenPressed(Command)
        // gamepad.getButton().whileHeld(Command)
        driver.getLeftButton().whenPressed(new DriveDistanceCommand(m_romiDrivetrain, 69));
        /////////////////////////////
        // driver.getRawLeftButton();
        
        
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        // return new DriveForwardCommand(m_romiDrivetrain);
        // return new DriveDistanceCommand(m_romiDrivetrain, 72.0);
        return new Cook(bread);
    }
}
