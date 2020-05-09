package ca.openhpi.capstone1.patterns.counter3.starter;


import ca.openhpi.capstone1.patterns.counter3.controller.CounterControllerStrategy;
import ca.openhpi.capstone1.patterns.counter3.model.Counter;
import ca.openhpi.capstone1.patterns.counter3.view.CounterViewColor;
import ca.openhpi.capstone1.patterns.counter3.view.CounterViewMove;
import ca.openhpi.capstone1.patterns.counter3.view.CounterViewNumber;
import processing.core.PApplet;

public class TheApp extends PApplet {

	CounterViewMove counterViewMove;
	CounterViewColor counterViewColor;
	CounterViewNumber counterViewNumber;
	CounterControllerStrategy counterControllerStrategy;
	Counter counter;

	@Override
	public void settings() {
		size(200, 200);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		counter = new Counter();
		counterControllerStrategy = new CounterControllerStrategy(counter);
		counterViewMove = new CounterViewMove(this, counter);
		counterViewColor = new CounterViewColor(this, counter);
		counterViewNumber = new CounterViewNumber(this, counter);
	}

	@Override
	public void draw() {  // draw() loops forever, until stopped
		background(204);
	}
	
	@Override
	public void mouseClicked() {
		counterControllerStrategy.handleEvent();
	}
}
