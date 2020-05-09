package ca.openhpi.capstone1.patterns.counter5.view;

import ca.openhpi.capstone1.patterns.counter5.model.Counter;
import processing.core.PApplet;

public class CounterViewMove extends AbstractView { 
		
	public CounterViewMove(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	public void update(Object obj) {
		try {
			int x = (int)obj;
			display.fill(0);
			display.rect(x, 10, 10, 10);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
