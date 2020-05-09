package ca.openhpi.capstone1.patterns.counter5.builder;

import ca.openhpi.capstone1.patterns.counter5.controller.CounterControllerStrategy;
import ca.openhpi.capstone1.patterns.counter5.model.Counter;
import ca.openhpi.capstone1.patterns.counter5.view.AbstractView;
import processing.core.PApplet;

public abstract class InteractiveComponent {
	
	protected AbstractView[] views; 
	protected CounterControllerStrategy counterControllerStrategy;
	protected Counter counter;
	
	
	public abstract void addModel();
	
	public abstract void createViews(PApplet applet);
	
	public abstract void addController();
	
	public abstract void handleEvent();
	
}
