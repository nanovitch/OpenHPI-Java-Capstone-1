package ca.openhpi.capstone1.patterns.counter3.view;

import ca.openhpi.capstone1.patterns.counter3.model.Subject;
import processing.core.PApplet;

public class CounterViewColor extends Observer {
		
	public CounterViewColor(PApplet display, Subject subject) {
		super(display, subject);
		update(0);
	}
	@Override
	public void update(Object value) {
		try {
			int[] colors = new int[3];
			
			int v = (int)value;
			
			colors[0] = (v * 10) % 255;
			colors[1] = (v * 5) % 255;
			colors[2] = (v * 20) % 255;
			display.fill(colors[0], colors[1], colors[2]);
			display.rect(1, 1, 10, 10);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
