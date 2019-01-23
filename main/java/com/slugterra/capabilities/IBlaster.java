package com.slugterra.capabilities;

public interface IBlaster {

	public boolean isReadyToFire();
	
	public void disableBlaster(float seconds);

	public void updateTimetoFire();
	
	public int getDelay();
	
	public void setDelay(float delay);
}
