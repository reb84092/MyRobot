package controller;
import model.EV3Bot;

public class RachelController 
{
	private String message;
	
	private int xPosition;
	private int yPosition;
	
	private long waitTime;
	
	private EV3Bot rachelBot;
	
	public RachelController()
	{
		this.message = "Programming Lego robots with Java";
		this.xPosition = 10;
		this.yPosition = 10;
		this.waitTime = 4000;
		
		rachelBot = new EV3Bot();
	}
	
	public void start()
	{
		LCD.drawString(message, xPosition, yPosition);
		Delay.msDelay(waitTime);
		
		rachelBot.driveRoom();
	}
}
