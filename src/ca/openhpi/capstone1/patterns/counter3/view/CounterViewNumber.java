package ca.openhpi.capstone1.patterns.counter3.view;

import ca.openhpi.capstone1.patterns.counter3.model.Subject;
import processing.core.PApplet;

public class CounterViewNumber extends Observer {
		
	public CounterViewNumber(PApplet display, Subject subject) {
		super(display, subject);
		update("0");
	}
	
	@Override
	public void update(Object value) {
		display.fill(0);
		display.textSize(32);
		display.text(value + "", 10, 30);
		display.redraw();
	}
}
