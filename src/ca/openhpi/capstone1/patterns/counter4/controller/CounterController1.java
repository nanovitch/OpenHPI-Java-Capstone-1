package ca.openhpi.capstone1.patterns.counter4.controller;

import ca.openhpi.capstone1.patterns.counter4.model.Counter;

public class CounterController1 implements Controller {

	private Counter counter;
	
	public CounterController1(Counter counter) { 
		this.counter = counter;
	}
	
	@Override
	public void handleEvent() {
		counter.updateCount(5);
	}
}
