package ca.openhpi.capstone1.patterns.counter1.view;

import ca.openhpi.capstone1.patterns.counter1.model.Counter;
import processing.core.PApplet;

public class CounterView extends Observer {

	//Counter counter;

	public CounterView(PApplet display, Counter subject) {
		super(display, subject);
		//this.counter = subject;
		update(0);
	}

	public void update(int x) {
		display.background(204);
		display.fill(0);
		display.rect(x, 10, 10, 10);
		display.redraw();
	}

}
