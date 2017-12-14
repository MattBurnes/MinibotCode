package org.usfirst.frc.team1334.robot.util;
import edu.wpi.first.wpilibj.Joystick;
public class Xbox360Controller extends Joystick{
	private double deadzone = 0.15;
	public Xbox360Controller(int port, double deadzone) {
		super(port);
		this.deadzone = deadzone;
	}
	

public double getLeftXAxis(){return deadzone(this.getRawAxis(0));}
public double getLeftYAxis(){return deadzone(this.getRawAxis(1));}
public double getLeftTrigger(){return deadzone(this.getRawAxis(2));}
public double getRightTrigger(){return deadzone(this.getRawAxis(3));}
public double getRightXAxis(){return deadzone(this.getRawAxis(4));}
public double getRightYAxis(){return deadzone(this.getRawAxis(5));}


public boolean getAButton(){return this.getRawButton(1);}
public boolean getBButton(){return this.getRawButton(2);}
public boolean getXButton(){return this.getRawButton(3);}
public boolean getYButton(){return this.getRawButton(4);}
public boolean getButtonRB(){return this.getRawButton(5);}
public boolean getButtonLB(){return this.getRawButton(6);}
public boolean getButtonLR(){return this.getRawButton(7);}
public boolean getButtonRR(){return this.getRawButton(8);}
public boolean getClickRStick(){return this.getRawButton(9);}
public boolean getClickLStick(){return this.getRawButton(10);}
public boolean getStartButton(){return this.getRawButton(11);}
private double deadzone(double in, double deadzone){return ((Math.abs(in) <= deadzone) ? 0 : in);}
private double deadzone(double in){return deadzone(in, this.deadzone);}





}

