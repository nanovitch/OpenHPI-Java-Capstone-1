package ca.openhpi.capstone1.patterns.counter5.view;

import processing.core.PApplet;
import ca.openhpi.capstone1.patterns.counter5.model.Counter;

public abstract class AbstractView {
	protected PApplet display;
	
	public AbstractView(PApplet display, Counter counter) {
		this.display = display;
		counter.attach(this);
	}
	
	public abstract void update(Object obj);
}
