package ca.openhpi.capstone1.patterns.counter5.view;

import ca.openhpi.capstone1.patterns.counter5.model.Counter;
import processing.core.PApplet;

public class CounterViewColor extends AbstractView {
	
	public CounterViewColor(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	public void update(Object obj) {
		try {
			int[] colors = new int[3];
			
			int v = (int)obj;
			
			colors[0] = (v * 10) % 255;
			colors[1] = (v * 5) % 255;
			colors[2] = (v * 20) % 255;
			
			display.fill(colors[0], colors[1], colors[2]);
			display.rect(1, 1, 10, 10);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
