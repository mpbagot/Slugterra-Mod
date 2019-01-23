package com.slugterra.capabilities;

public class Blaster implements IBlaster {

	private int timeToFireAgain = 0;
	
	public void setDelay(float delay) {
		timeToFireAgain = (int) (delay * 20);
	}
	
	public boolean isReadyToFire()
	{
		return timeToFireAgain == 0;
	}
	
	public void disableBlaster(float seconds) {
		timeToFireAgain = (int) (seconds * 20);
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
