package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Bread;

public class Cook extends CommandBase {
    private Bread bread;

    public Cook(Bread bread) {
        this.bread = bread;
        addRequirements(bread);
    }

    public void initialize() {

    }

    @Override
    public void execute() {
        bread.bake(1,1);
    }

    public boolean isFinished() {
        return false;
    }

}
