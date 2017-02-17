package org.usfirst.frc.team2557.robot.subsystems;
import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

public class catapult extends Subsystem {
	public void shooter(){
		
	
	if(Robot.oi.blueX.get() == true){
		RobotMap.catapult.set(.7);
	}
	else if (Robot.oi.blueX.get() == false){
		RobotMap.catapult.set(0);
	}
	
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

