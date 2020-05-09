package ca.openhpi.capstone1.patterns.counter4.view;

import ca.openhpi.capstone1.patterns.counter4.model.Counter;
import processing.core.PApplet;

public class CounterViewNumber extends View {
		
	public CounterViewNumber(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	@Override
	public void update(Object obj) {
		try {
			int number = (int)obj;
			display.fill(0);
			display.textSize(32);
			display.text(number + "", 10, 30);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
