package ca.openhpi.capstone1.patterns.counter3.view;

import ca.openhpi.capstone1.patterns.counter3.model.Subject;
import processing.core.PApplet;

public abstract class Observer {
	protected PApplet display;	
	
	public Observer(PApplet display, Subject subject) {
		this.display = display;
		subject.attach(this);
	}
	
	public abstract void update(Object value);
}
