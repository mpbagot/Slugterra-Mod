package com.slugterra.capabilities;

public class Blaster implements IBlaster {

	private boolean canLaunch = true;
	private int timeToFireAgain = 0;
	
	public void setDelay(int delay) {
		this.timeToFireAgain = delay;
		this.canLaunch = this.timeToFireAgain == 0;
	}
	
	public boolean reCheckFiring()
	{
		if (this.timeToFireAgain != 0)
		{
			return false;
		}
		else
		{
			timeToFireAgain = 40;
			return true;
		}
	}
	
	public void disableBlaster() {
		timeToFireAgain = 250;
	}

	public void updateTimetoFire() {
		if (timeToFireAgain > 0)
			--timeToFireAgain;
		else
			timeToFireAgain = 0;
	}
	
	public int getDelay() {
		return timeToFireAgain;
	}
	
}
