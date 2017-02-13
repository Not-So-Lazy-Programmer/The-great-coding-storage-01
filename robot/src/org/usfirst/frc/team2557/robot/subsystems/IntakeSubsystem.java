package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
	public void intake(){
    
		if (Robot.oi.d_up.get() == true){
			RobotMap.intake.set(.75);

		}
		else if(Robot.oi.d_down.get() == true){
		RobotMap.intake.set(-.75);
		}
		
		else{
			RobotMap.intake.set(0);
		}
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

