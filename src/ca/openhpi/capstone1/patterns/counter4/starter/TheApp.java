package ca.openhpi.capstone1.patterns.counter4.starter;


import ca.openhpi.capstone1.patterns.counter4.controller.CounterControllerStrategy;
import ca.openhpi.capstone1.patterns.counter4.model.Counter;
import ca.openhpi.capstone1.patterns.counter4.view.CounterViewColor;
import ca.openhpi.capstone1.patterns.counter4.view.CounterViewMove;
import ca.openhpi.capstone1.patterns.counter4.view.CounterViewNumber;
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
		/*fill(255);
		rect(random(100),random(100), 10, 10);
		counterViewMove.update((Object)0); 
		counterViewColor.update((Object)1); 
		counterViewNumber.update((Object)0);*/
	}
	
	@Override
	public void mouseClicked() {
		counterControllerStrategy.handleEvent();
	}
}
