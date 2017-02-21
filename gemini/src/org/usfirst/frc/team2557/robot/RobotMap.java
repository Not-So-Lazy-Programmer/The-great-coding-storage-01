package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static CANTalon FRwheel;
	public static CANTalon FLwheel;
	public static CANTalon BRwheel;
	public static CANTalon BLwheel;
	public static RobotDrive robotdrive;
	public static CANTalon intake;
	
	
public static void init(){
	
	FRwheel = new CANTalon(1);
	FLwheel = new CANTalon(2);
	BRwheel = new CANTalon(3);
	BLwheel = new CANTalon(4);
	robotdrive = new RobotDrive (FRwheel,FLwheel,BLwheel,BRwheel);
	intake = new CANTalon(7);
	
	
	
	
	
	
}
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1; wheel
}
