package ca.openhpi.capstone1.patterns.counter3.view;

import ca.openhpi.capstone1.patterns.counter3.model.Subject;
import processing.core.PApplet;

public class CounterViewMove extends Observer {
		
	public CounterViewMove(PApplet display, Subject subject) {
		super(display, subject);
		update(0);
	}
	
	@Override
	public void update(Object value) {
		try {
			int x = (int)value;
			display.fill(0);
			display.rect(x, 10, 10, 10);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
