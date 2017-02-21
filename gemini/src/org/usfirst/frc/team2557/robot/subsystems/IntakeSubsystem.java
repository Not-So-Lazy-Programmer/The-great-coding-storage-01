package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;
import org.usfirst.frc.team2557.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new IntakeCommand());
    }
    
   public void intake(){
	   
	   if(RobotMap.gemini == false) {
		   if(Robot.oi.rightBumper.get()){
			   RobotMap.intake.set(-.8);
		   }
		   else if(Robot.oi.leftBumper.get()){
			   RobotMap.intake.set(.8);
		   }
		   else{
			   RobotMap.intake.set(0);
		   }
		  
	   }
	   
	   
	   
   }
    
    
}

