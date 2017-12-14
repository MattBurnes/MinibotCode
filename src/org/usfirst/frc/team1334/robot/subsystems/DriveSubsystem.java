package org.usfirst.frc.team1334.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Talon Left1 = new Talon(0); 
	Talon Left2 = new Talon(1);
	Talon Right1 = new Talon(2);
	Talon Right2 = new Talon(3);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void tankDrive(double left, double right) {
	
		Left1.set(left);
		Left2.set(left);
		Right1.set(right);
		Right2.set(right);
	}
	public void arcadeDrive (double speed, double turn){
		tankDrive(speed +turn, -speed + turn);
	}
}
