package com.stuypulse.robot.commands.auton;

import com.pathplanner.lib.PathConstraints;
import com.pathplanner.lib.PathPlanner;
import com.stuypulse.robot.commands.arm.routines.ArmIntake;
import com.stuypulse.robot.commands.arm.routines.ArmReady;
import com.stuypulse.robot.commands.intake.IntakeAcquire;
import com.stuypulse.robot.commands.intake.IntakeDeacquire;
import com.stuypulse.robot.commands.intake.IntakeScore;
import com.stuypulse.robot.commands.intake.IntakeStop;
import com.stuypulse.robot.commands.leds.LEDSet;
import com.stuypulse.robot.commands.manager.ManagerSetGamePiece;
import com.stuypulse.robot.commands.manager.ManagerSetGridNode;
import com.stuypulse.robot.commands.manager.ManagerSetNodeLevel;
import com.stuypulse.robot.commands.manager.ManagerSetScoreSide;
import com.stuypulse.robot.commands.swerve.SwerveDriveFollowTrajectory;
import com.stuypulse.robot.subsystems.Manager.GamePiece;
import com.stuypulse.robot.subsystems.Manager.NodeLevel;
import com.stuypulse.robot.subsystems.Manager.ScoreSide;
import com.stuypulse.robot.subsystems.arm.Arm;
import com.stuypulse.robot.util.DebugSequentialCommandGroup;
import com.stuypulse.robot.util.LEDColor;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class NewbieAuton extends DebugSequentialCommandGroup{
    private static final double INTAKE_DEACQUIRE_TIME = 0.5;
    private static final double INTAKE_STOP_WAIT_TIME = 0.5;
    private static final double INTAKE_WAIT_TIME = 2.0;
    private static final double ACQUIRE_WAIT_TIME = 0.4;

    private static final PathConstraints INTAKE_PIECE_CONSTRAINTS = new PathConstraints(1.7, 2);
    private static final PathConstraints SCORE_PIECE_CONSTRAINTS = new PathConstraints(2, 2);

    public NewbieAuton () {
        var paths = SwerveDriveFollowTrajectory.getSeparatedPaths(
            PathPlanner.loadPathGroup("NewbieAuton", INTAKE_PIECE_CONSTRAINTS, SCORE_PIECE_CONSTRAINTS),
            "Intake Piece", "Score Piece", "Drive Back"
        );

        var arm = Arm.getInstance();

        // intake piece from center
        addCommands(
            new ManagerSetGamePiece(GamePiece.CUBE),
            new ParallelCommandGroup(
                new SwerveDriveFollowTrajectory(paths.get("Intake Piece"))
                    .robotRelative()
                    .withStop(),

                new WaitCommand(INTAKE_STOP_WAIT_TIME)
                    .andThen(new IntakeStop())
                    .andThen(new WaitCommand(INTAKE_WAIT_TIME))
                    .andThen(new IntakeAcquire()),

                new ArmIntake()
                    .withTolerance(7, 10)
                    .withTimeout(6.5)
            ),

            new WaitCommand(ACQUIRE_WAIT_TIME)
                .alongWith(arm.runOnce(() -> arm.setWristVoltage(-2))),

            arm.runOnce(() -> arm.setWristVoltage(0))
        );

        // drive to grid and score 2nd piece piece
        addCommands(
            new ManagerSetGamePiece(GamePiece.CUBE),
            new ManagerSetScoreSide(ScoreSide.BACK),

            new SwerveDriveFollowTrajectory(
                paths.get("Score Piece"))
                    .fieldRelative()
                .withStop()
                .alongWith(new WaitCommand(0.8).andThen(new ArmReady()
                    .withTolerance(17, 9).alongWith(new WaitCommand(0.1).andThen(new IntakeStop())))),

            new ManagerSetGridNode(1),
            new IntakeDeacquire(),
            new WaitCommand(INTAKE_DEACQUIRE_TIME),
            new IntakeStop()

        );

        addCommands(
            new LEDSet(LEDColor.RAINBOW),
            new SwerveDriveFollowTrajectory(
                paths.get("Drive Back"))
                    .fieldRelative()
        );
    }





}

