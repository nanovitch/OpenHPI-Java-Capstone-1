package ca.openhpi.capstone1.patterns.counter1.controller;

import ca.openhpi.capstone1.patterns.counter1.model.Counter;

public class CounterController {

	Counter counter;
	
	public CounterController(Counter counter) {
		this.counter = counter;
	}
	
	public void handleEvent() {
		counter.setCount(counter.getCount() + 1);
	}
}
