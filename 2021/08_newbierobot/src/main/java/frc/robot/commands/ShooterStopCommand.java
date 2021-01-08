package frc.robot.commands;

import frc.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj2.command.InstantCommand;

public class ShooterStopCommand extends InstantCommand {
    
    // TODO: make shooter shoot command
    private Shooter shooter;

    public ShooterStopCommand(Shooter shooter) {
        // TODO: add requirements
        this.shooter = shooter;

        addRequirements(shooter);
    }

    public void initialize() {
        shooter.set(0.0);
    }

}
