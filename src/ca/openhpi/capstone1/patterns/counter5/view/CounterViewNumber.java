package ca.openhpi.capstone1.patterns.counter5.view;

import ca.openhpi.capstone1.patterns.counter5.model.Counter;
import processing.core.PApplet;

public class CounterViewNumber extends AbstractView {
			
	public CounterViewNumber(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	@Override
	public void update(Object obj) {
		int number = (int)obj;
		display.fill(0);
		display.textSize(32);
		display.text(number + "", 10, 30);
	}
}
