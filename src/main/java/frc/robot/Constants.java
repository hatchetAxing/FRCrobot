// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //PWMs for wiring
    public static final int LEFT_FRONT = 0; 
    public static final int RIGHT_FRONT = 1; 
    public static final int LEFT_BACK = 2; 
    public static final int RIGHT_BACK = 3; // ADJUST PORTS
    public static final int SHOOTER = 6;
    public static final int INTAKE = 5;

    //analog
    public static final int RANGE_FINDER = 4;


    //axis
    public static final int XBOX_LEFT_X_AXIS = 1;
    public static final int XBOX_LEFT_Y_AXIS = 0; // ADJUST ALSO

    public static final double DRIVETRAINSPEED = 0.7; // just adjust everything lol
	public static final double DRIVE_FORWARD_TIME = 3.0; // the seconds
	public static final double AUTONOMOUS_SPEED = 0.4; // needs to be slower than drive train

    public static final int JOYSTICK_NUMBER = 0;
	public static final double SHOOTER_SPEED = 0.5;
    public static final int RIGHT_TRIGGER = 3;
	public static final double INTAKE_SPEED = 0.5;
	public static final int CAM_RES_Y = 240; //height
	public static final int CAM_RES_X = 320; //width
	public static final double AUTO_SHOOT_TIME = 2.0;
	public static final double SETPOINT_FORWARD = 1.5;
    
	
	

}
