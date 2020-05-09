package ca.openhpi.capstone1.patterns.counter5.controller;

import ca.openhpi.capstone1.patterns.counter5.model.Counter;

public class CounterController1 implements Controller {

	Counter counter;
	
	public CounterController1(Counter counter) { 
		this.counter = counter;
	}
	
	public void handleEvent() {
		counter.updateCount(5);
	}

}
