package ca.openhpi.capstone1.patterns.counter3.controller;

import ca.openhpi.capstone1.patterns.counter3.model.Counter;

public class CounterController1 implements Controller {

	Counter counter;
	
	public CounterController1(Counter counter) { 
		this.counter = counter;
	}
	
	@Override
	public void handleEvent() {
		counter.updateCount(5);
	}
}
