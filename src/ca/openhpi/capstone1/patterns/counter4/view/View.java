package ca.openhpi.capstone1.patterns.counter4.view;

import ca.openhpi.capstone1.patterns.counter4.model.Counter;
import processing.core.PApplet;

public abstract class View {

	protected Counter counter;
	protected PApplet display;

	public View(PApplet display, Counter counter) {
		this.display = display;
		this.counter = counter;
		counter.attach(this);
	}
	
	public abstract void update(Object obj);

}