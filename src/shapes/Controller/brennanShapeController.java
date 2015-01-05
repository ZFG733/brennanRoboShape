package shapes.Controller;

import lejos.nxt.Button;
import shapes.Model.brennanDrawsRobot;

public class brennanShapeController
{
	private brennanDrawsRobot debugBot;
	
	public brennanShapeController()
	{
		debugBot = new brennanDrawsRobot();
	}
	
	public void start()
	{
		while(Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			debugBot.drawCircle(1, 1);
			debugBot.drawSquare(4, 1);
			debugBot.drawTriangle(3, 1);
			debugBot.drawHexagon(6, 1);
			debugBot.drawOctagon(8, 1);
		}
	}
}
