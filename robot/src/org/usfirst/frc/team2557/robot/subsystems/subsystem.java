package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class subsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive() {
    	RobotMap.robotdrive.arcadeDrive(0,0);
    	
    	RobotMap.myRobot.ArcadeDrive(Robot.oi.remote.getRawAxis(1),Robot.oi.remote.getRawAxis(0));
    	
    }
    
    
    
    
    
//	public static final int kGamepadAxisLeftStickX = 1;
//	public static final int kGamepadAxisLeftStickY = 2;
//	public static final int kGamepadAxisShoulder = 3;
//	public static final int kGamepadAxisRightStickX = 4;
//	public static final int kGamepadAxisRightStickY = 5;
//	public static final int kGamepadAxisDpad = 6;
    
    
    
    
    
    
    
    
    
}

