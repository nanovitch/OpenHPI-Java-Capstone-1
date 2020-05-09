package ca.openhpi.capstone1.patterns.counter5.builder;

import processing.core.PApplet;

public interface Builder {
	public void buildComponent();
	public void buildModel(); 
	public void buildView(PApplet applet);
	public void buildController();
	
	public InteractiveComponent getComponent();
}
