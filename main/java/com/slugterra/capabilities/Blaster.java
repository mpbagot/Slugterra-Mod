package com.slugterra.capabilities;

public class Blaster implements IBlaster {

	private int timeToFireAgain = 0;
	
	public void setDelay(int delay) {
		timeToFireAgain = delay;
	}
	
	public boolean isReadyToFire()
	{
		if (timeToFireAgain == 0)
			timeToFireAgain = 40;
		return timeToFireAgain == 0;
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
