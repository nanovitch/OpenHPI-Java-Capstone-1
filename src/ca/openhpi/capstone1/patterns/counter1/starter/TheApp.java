package ca.openhpi.capstone1.patterns.counter1.starter;


import ca.openhpi.capstone1.patterns.counter1.controller.CounterController;
import ca.openhpi.capstone1.patterns.counter1.model.Counter;
import ca.openhpi.capstone1.patterns.counter1.view.CounterView;
import ca.openhpi.capstone1.patterns.counter1.view.Observer;
import processing.core.PApplet;

public class TheApp extends PApplet {

	private Observer counterView;
	private CounterController counterController;
	private Counter counter;

	@Override
	public void settings() {
		size(200, 200);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		counter = new Counter();
		counterController = new CounterController(counter);
		counterView = new CounterView(this, counter);
	}

	@Override
	public void draw() {
	}  // draw() loops forever, until stopped
	
	@Override
	public void mouseClicked() {
		counterController.handleEvent();
	}
}
