package com.slugterra.capabilities;

public interface IBlaster {

	public boolean isReadyToFire();
	
	public void disableBlaster();

	public void updateTimetoFire();
	
	public int getDelay();
	
	public void setDelay(int delay);
}
