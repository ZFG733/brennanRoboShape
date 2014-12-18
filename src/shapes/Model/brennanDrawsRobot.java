package shapes.Model;

import lejos.nxt.Motor;

public class brennanDrawsRobot
{
	public void drawSahpe(int numberOfSides, int length)
	{
		int angle = calculateAngle(numberOfSides);
		
		for(int drawCount =0; drawCount < numberOfSides; drawCount++)
		{
			try
			{
				Motor.A.rotate(angle, true);
				Motor.B.flt();
				Motor.C.backward();
				Thread.sleep(length* 1000);
				Motor.A.rotate(0,true);
				Motor.B.stop();
				Motor.C.stop();
				
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int calculateAngle(int numberOfSides)
	{
		int currentAngle = 0;
		
		if(numberOfSides != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
}
