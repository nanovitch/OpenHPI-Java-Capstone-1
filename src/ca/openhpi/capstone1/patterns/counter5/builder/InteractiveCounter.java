package ca.openhpi.capstone1.patterns.counter5.builder;

import ca.openhpi.capstone1.patterns.counter5.controller.CounterControllerStrategy;
import ca.openhpi.capstone1.patterns.counter5.model.Counter;
import ca.openhpi.capstone1.patterns.counter5.view.AbstractView;
import ca.openhpi.capstone1.patterns.counter5.view.CounterViewColor;
import ca.openhpi.capstone1.patterns.counter5.view.CounterViewMove;
import ca.openhpi.capstone1.patterns.counter5.view.CounterViewNumber;
import processing.core.PApplet;

public class InteractiveCounter extends InteractiveComponent {
	
	public InteractiveCounter() {}
	
	public void addModel() {
		counter = new Counter();
	}
	
	public void createViews(PApplet applet) {
		views = new AbstractView[3];
		views[0] = new CounterViewMove(applet, counter);
		views[1] = new CounterViewColor(applet, counter);
		views[2] = new CounterViewNumber(applet, counter);
	}
	
	public void addController() {
		counterControllerStrategy = new CounterControllerStrategy(counter);
	}
	
	public void handleEvent() {
		counterControllerStrategy.handleEvent();
	}
}
