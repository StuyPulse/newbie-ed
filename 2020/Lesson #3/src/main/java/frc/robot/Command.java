package frc.robot;

public interface Command {

    //the default means that this method does not have to be specified in its children
    //without it, its children would need to have the methods

    default void initialize() {} //run at the start of the command
    default void execute() {} //repeatedly run while the command is running
    default void end(boolean interrupted) {} //run when the command ends
    default boolean isFinished() { return true; } //returns whether or not the command is done
    default boolean runsWhenDisabled() { return false; } //returns whether or not the command runs when disabled

}