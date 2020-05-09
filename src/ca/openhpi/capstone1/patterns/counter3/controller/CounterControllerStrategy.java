package ca.openhpi.capstone1.patterns.counter3.controller;

import ca.openhpi.capstone1.patterns.counter3.model.Counter;

public class CounterControllerStrategy {
	private Controller counterController1;
	private Controller counterController2;
	private boolean largeStep = false;
	
	public CounterControllerStrategy(Counter counter) {
		this.counterController1 = new CounterController1(counter);
		this.counterController2 = new CounterController2(counter);
	}
	
	public void handleEvent() {
		if (largeStep == true) {
			counterController1.handleEvent();
			largeStep = false;
		} else {
			counterController2.handleEvent();
			largeStep = true;
		}
	}
	

}
