/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.stuypulse.stuylib.network.SmartNumber;

/**
 * This contains all of the ports for motors, gamepads, etc.
 * 
 * Try to avoid having random constants around your code.
 * 
 * The reason its an interface is so that all the values are constant
 */
public interface Constants {

    interface Ports {
        interface Drivetrain {
            int FRONT_LEFT = 1;
            int FRONT_RIGHT = 3;
            int BACK_LEFT = 4;
            int BACK_RIGHT = 2;
        }
        
        int SHOOTER = 13;
    }

}
