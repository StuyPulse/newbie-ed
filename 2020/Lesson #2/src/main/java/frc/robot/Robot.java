/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.util.Gamepad;

public class Robot extends TimedRobot {

  //Note: we use camel case to name the below (soLikeThis)
  private WPI_VictorSPX shooterMotor;

  private WPI_TalonSRX rightFrontMotor;
  private WPI_TalonSRX rightRearMotor;
  private WPI_TalonSRX leftFrontMotor;
  private WPI_TalonSRX leftRearMotor;

  private SpeedControllerGroup rightMotors;
  private SpeedControllerGroup leftMotors;

  private DifferentialDrive differentialDrive;

  //the Gamepad class we use is copy and pasted from previous years' robot code
  //you can find it in the util folder
  private Gamepad gamepad;

  @Override
  public void robotInit() {
    //makes new motor at port 13
    shooterMotor = new WPI_VictorSPX(13);

    //makes four new motors for the drivetrain
    //Note: -1 is used as a placeholder for the port
    rightFrontMotor = new WPI_TalonSRX(-1);
    rightRearMotor = new WPI_TalonSRX(-1);
    leftFrontMotor = new WPI_TalonSRX(-1);
    leftRearMotor = new WPI_TalonSRX(-1);

    //inverts the motor
    shooterMotor.setInverted(true);

    //makes motor coast to a stop when given speed of 0
    //can also be set to NeutralMode.Brake to make motor stop when given speed of 0
    shooterMotor.setNeutralMode(NeutralMode.Coast);

    //speed controller groups allow us to group motors together
    //so instead of controlling the right front and rear motors separately, we can control them together
    //it takes the motors being grouped together as arguments (order doesn't matter)
    rightMotors = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);
    leftMotors = new SpeedControllerGroup(leftFrontMotor, leftRearMotor);

    //differential drive acts as a further method of grouping the left and right side of the motors
    //it takes two speed controllers as arguments (it must be the left one then the right)
    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);

    gamepad = new Gamepad(0);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopPeriodic() {
    //sets motor speed to 0.25
    //speed ranges from -1 to 1 (full speed backwards to full speed forwards)
    shooterMotor.set(0.25);

    if (gamepad.getRawBottomButton()) {
      //runs only if bottom button is being pressed
      differentialDrive.tankDrive(0.5, 0.2); //sets left motors to 0.5 speed and right motors to 0.2 speed
    } else if (gamepad.getRawDPadDown()) {
      //runs only if bottom D pad is being pressed
      differentialDrive.arcadeDrive(0.3, -0.25); //sets robot to go 0.3 speed forward while turning at -0.25 speed
    } else { //if neither of the above are true...
      //uses gamepad values for the left and right joysticks to set left and right motor speeds
      differentialDrive.tankDrive(gamepad.getLeftY(), gamepad.getRightY());
    }
  }

  @Override
  public void testPeriodic() {
  }
}
