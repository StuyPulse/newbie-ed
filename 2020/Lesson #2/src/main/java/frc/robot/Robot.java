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

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.util.Gamepad;

public class Robot extends TimedRobot {

  //Note: we use camel case to name the below (soLikeThis)
  
  //Documentation for below motor controllers:
  //http://www.ctr-electronics.com/downloads/api/java/html/index.html

  private WPI_VictorSPX shooterMotor;

  private WPI_TalonSRX rightFrontMotor;
  private WPI_TalonSRX rightRearMotor;
  private WPI_TalonSRX leftFrontMotor;
  private WPI_TalonSRX leftRearMotor;

  //Documentation for below:
  //https://first.wpi.edu/FRC/roborio/release/docs/java/index.html

  private SpeedControllerGroup rightMotors;
  private SpeedControllerGroup leftMotors;

  private DifferentialDrive differentialDrive;

  private Solenoid floop;
  private boolean wasPressed; //needed to make sure one button press isn't mistaken as multiple presses

  //the Gamepad class we use is copy and pasted from previous years' robot code
  //you can find it in the util folder
  private Gamepad gamepad;

  //digital inputs return boolean values, analog inputs return double values 
  private DigitalInput IRsensor; //detect if something is in front of it
  private DigitalInput limitSwitch; //like a button, returns whether or not it's being pressed
  private AnalogInput lineSensor; //detect color of line it's facing

  //Note: this is just one type of encoder
  private Encoder encoder; //used to find distance a wheel turns

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

    //makes new solenoid (for piston)
    floop = new Solenoid(-1);

    gamepad = new Gamepad(0);

    IRsensor = new DigitalInput(-1);
    limitSwitch = new DigitalInput(-1);
    lineSensor = new AnalogInput(-1);

    encoder = new Encoder(-1, -1);

    //encoders receive evenly spaced out pulses as wheels turn
    //this sets distance wheel travels at each pulse
    //usually something like circumference/pulses per revolution
    encoder.setDistancePerPulse(-1);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    //prints values received from sensors (methods are defined below)
    System.out.println("IR Sensor Value: " + getIRSensorValue());
    System.out.println("Limit Switch Value: " + getLimitSwitchValue());
    System.out.println("Line Sensor Value: " + getLineSensorValue());
    System.out.println("Encoder Ticks: " + getEncoderTicks());
    System.out.println("Encoder Distance: " + getEncoderDistance());
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

    //to open floop when holding button
    if (gamepad.getRawDPadDown()) { //if the button is being held down, open floop
      floop.set(true); 
    } else { //otherwise (if the button is not being held down)
      floop.set(false);
    }

    //OR if you want a toggle (press to open, press again to close...)

    // if (!wasPressed && gamepad.getRawDPadUp()) { //makes sure was not pressed before but is pressed now
    //   floop.set(!floop.get()); //sets floop to opposite of current value (true->false, false->true)
    // }

    // wasPressed = gamepad.getRawDPadUp(); //updates past value
  }

  @Override
  public void testPeriodic() {
  }

  //returns boolean representing value of IR sensor
  private boolean getIRSensorValue() {
    return IRsensor.get();
  }

  //returns boolean representing value of limit switch
  private boolean getLimitSwitchValue() {
    return limitSwitch.get();
  }

  //returns double representing value of line sensor
  private double getLineSensorValue() {
    return lineSensor.getValue();
  }
  
  //returns number of pulses encoder has detected
  private int getEncoderTicks() {
    return encoder.get();
  }

  //returns the actual distance (calculated based on ticks and distance per pulse set before)
  private double getEncoderDistance() {
    return encoder.getDistance();
  }
}
