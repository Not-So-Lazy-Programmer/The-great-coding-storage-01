package org.usfirst.frc.team2557.robot.subsystems;


import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {
    public void arm(){
    	
	if(Robot.oi.remote.getRawAxis(3)>0.1){
		RobotMap.motorArm1.set(0);
		RobotMap.motorArm2.set(0);
    }
	
	else if(Robot.oi.remote.getRawAxis(2)>0.1){
		RobotMap.motorArm1.set(0);
		RobotMap.motorArm2.set(0);
		
	}
	
	else{
		RobotMap.motorArm1.set(0);
		RobotMap.motorArm2.set(0);
	}
	
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

//public static final int kGamepadAxisLeftStickX = 0;
//public static final int kGamepadAxisLeftStickY = 1;
//public static final int kGamepadAxisLeftShoulder = 2;
//public static final int kGamepadAxisRightShoulder = 3;
//public static final int kGamepadAxisRightStickX = 4;
//public static final int kGamepadAxisRightStickY = 5;
//public static final int kGamepadAxisDpad = is a POV;

