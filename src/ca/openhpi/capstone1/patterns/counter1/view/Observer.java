package ca.openhpi.capstone1.patterns.counter1.view;

import ca.openhpi.capstone1.patterns.counter1.model.Subject;
import processing.core.PApplet;

public abstract class Observer {
	protected PApplet display;	
	
	public Observer(PApplet display, Subject subject) {
		this.display = display;
		subject.attach(this);
	}
	
	public abstract void update(int x);
}
