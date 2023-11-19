/* (if you see a blue line this is how you add highlighted notes with #XXX:)
#XXX: This code is supposed to be in: 
MotorLab\src\main\java\com\stuypulse\robot\commands\DriveFunctions.java
but I have just extracted it to here for easy viewing of sample answers
*/
package com.stuypulse.robot.commands;

import com.stuypulse.robot.util.Motor;
// courtesy of the cool kids that finished this supa fast!
public class DriveFunctions {
    
    public static void driveForwards(Motor left, Motor right) {
        left.set(1);
        right.set(1);
    }

    public static void driveBackwards(Motor left, Motor right) {
        left.set(-1);
        right.set(-1);
    }

    // For turnRight/Left, while setting the other one to 0 would work, if you look in simulation, setting it to -1 makes it easier smoother when turning
    public static void turnRight(Motor left, Motor right) {
        left.set(1);
        //right.set(0);
        right.set(-1);
    }

    public static void turnLeft(Motor left, Motor right) {
        //left.set(0);
        left.set(-1);
        right.set(1);
    }

    // For the robot to move forward while moving in a direction, have both be positive while one side is moving faster then the other 
    public static void arcRight(Motor left, Motor right) {
        left.set(1);
        right.set(0.5);
    }

    public static void arcLeft(Motor left, Motor right) {
        left.set(0.5);
        right.set(1);
    }

    //XXX: The reason you aren't using while loops in here because once you set the motor to a speed, it WILL be driving continously because of other code in the background, all you have to do is check the distance

    public static void stopDistance(Motor left, Motor right) {
        //stopDistance drives a distance and then stops once you move past it
        double setpoint = 60; 
        if (left.getDistance() < setpoint && right.getDistance() < setpoint) {
            driveForwards(left, right); //reuse methods you've already written if the behavior is the same
        } 
        else {
            driveBackwards(left, right); //same here
        }
    }

    public static void bangBang(Motor left, Motor right) {  
        // drive forward, and if you've noticed that you've over shot the distance, start driving back
        double setpoint = 60;
        if (left.getDistance() > setpoint && right.getDistance() > setpoint) {
            left.set(-1);
            right.set(-1);
        } else {
            left.set(1);
            right.set(1);
        }
    }

    public static void lessBang(Motor left, Motor right) {
        double setpoint = 60;
        // same as bang bang but you start driving back with less speed then the speed you drove forward at 
        if (left.getDistance() > setpoint && right.getDistance() > setpoint) {
            left.set(-0.5);
            right.set(-0.5);
        } else {
            left.set(0.5);
            right.set(0.5);
        }   
    }

    public static void betterControl(Motor left, Motor right) {
        // similar to lessBang but with even more precision (notice a pattern?)
        //Driving forwards:
        if (left.getDistance() <= 10 && right.getDistance() <= 10) {
            left.set(1);
            right.set(1);
        }
        else if (left.getDistance() <= 30 && right.getDistance() <= 30) {
            left.set(0.5);
            right.set(0.5);
        }
        else if (left.getDistance() <= 60 && right.getDistance() <= 60) {
            //as you are getting closer and closer to 60, you are driving slower (0.1 now instead of 1)
            left.set(0.1);
            right.set(0.1);
        }
        
        //Driving backwards to correct for over shooting past 60-70 , 70-80 ,80+
        else if (left.getDistance() >= 60 && right.getDistance() >= 60) {
            left.set(-0.1);
            right.set(-0.1);
        }
        else if (left.getDistance() >= 70 && right.getDistance() >= 70) {
            left.set(-0.5);
            right.set(-0.5);
        }
        else if (left.getDistance() >= 80 && right.getDistance() >= 80) {
            //as you are getting further and further away, you are driving faster back to get back to 60 faster(-1 now instead of -0.1)
            left.set(-1);
            right.set(-1);
        } 

        //Stop if you are at between an Margin of error of 0.2 of 60 (so you stop ossilating as you are drive back and forward)
        else if (left.getDistance() >= 59.8 && left.getDistance() <= 60.2 && right.getDistance() >= 59.8 && right.getDistance() <= 60.2) {
            left.set(0);
            right.set(0);
        }
        
    }

    public static void bestestControl(Motor left, Motor right) {
        // same as betterControl but with a PID loop (the most precise)
        //XXX: This is the only one that uses a while loop because you are constantly checking the distance and adjusting the speed
        double setpoint = 60;
        double kP = 0.1;
        double kI = 0.1;
        double kD = 0.1;
        double error = 0;
        double integral = 0;
        double derivative = 0;
        double previousError = 0;
        while (true) {
            //error is the difference between the setpoint and the current distance
            error = setpoint - left.getDistance();
            
            integral += error;

            derivative = error - previousError;
            previousError = error;

            //XXX: This is the PID equation of output = kP * error + kI * integral + kD * derivative (dw if you don't understand it, just know that it works)
            double output = kP * error + kI * integral + kD * derivative;
            left.set(output);
            right.set(output);
        }
    }
}
