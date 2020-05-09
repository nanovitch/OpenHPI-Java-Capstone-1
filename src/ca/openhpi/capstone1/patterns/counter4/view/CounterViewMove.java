package ca.openhpi.capstone1.patterns.counter4.view;

import ca.openhpi.capstone1.patterns.counter4.model.Counter;
import processing.core.PApplet;

public class CounterViewMove extends View {
		
	public CounterViewMove(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	@Override
	public void update(Object obj) {
		try {
			int x = (int)obj;
			display.fill(0);
			display.rect(x, 10, 10, 10);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
