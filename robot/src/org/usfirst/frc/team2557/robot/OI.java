package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2557.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick remote = new Joystick (0);
	
	
    //// CREATING BUTTONS
	
	
	
	public JoystickButton greenA = new JoystickButton (remote,1);
	public JoystickButton redB = new JoystickButton (remote,2);
	public JoystickButton blueX = new JoystickButton (remote,3);
	public JoystickButton yellowY = new JoystickButton (remote,4);
	public JoystickButton LeftBumper = new JoystickButton (remote,5);
	public JoystickButton RightBumper = new JoystickButton (remote,6);
	public JoystickButton BACKbutton = new JoystickButton (remote,7);
	public JoystickButton STARTbutton = new JoystickButton (remote,8); 
	public JoystickButton LeftStick = new JoystickButton (remote,9);
	public JoystickButton RightStick = new JoystickButton (remote,10);
	public JoystickButton MODEbutton = new JoystickButton (remote,-1);
	public JoystickButton LOGITECHbutton = new JoystickButton (remote,-1);
	
	
	// Gamepad axis
//		public static final int kGamepadAxisLeftStickX = 0;
//		public static final int kGamepadAxisLeftStickY = 1;
//		public static final int kGamepadAxisLeftShoulder = 2;
//		public static final int kGamepadAxisRightShoulder = 3;
//		public static final int kGamepadAxisRightStickX = 4;
//		public static final int kGamepadAxisRightStickY = 5;
//		public static final int kGamepadAxisDpad = is a POV;
//
//		// Gamepad buttons
//		public static final int kGamepadButtonA = 1; // Bottom Button
//		public static final int kGamepadButtonB = 2; // Right Button
//		public static final int kGamepadButtonX = 3; // Left Button
//		public static final int kGamepadButtonY = 4; // Top Button
//		public static final int kGamepadButtonShoulderL = 5;
//		public static final int kGamepadButtonShoulderR = 6;
//		public static final int kGamepadButtonBack = 7;
//		public static final int kGamepadButtonStart = 8;
//		public static final int kGamepadButtonLeftStick = 9;
//		public static final int kGamepadButtonRightStick = 10;
//		public static final int kGamepadButtonMode = -1;
//		public static final int kGamepadButtonLogitech = -1;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

