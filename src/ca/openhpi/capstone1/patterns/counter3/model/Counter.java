package ca.openhpi.capstone1.patterns.counter3.model;
import java.util.ArrayList;
import java.util.List;

import ca.openhpi.capstone1.patterns.counter3.view.Observer;

public class Counter implements Subject {

	private int count = 0;

	private List<Observer> observers = new ArrayList<Observer>();

	public void updateCount(int value) {
		this.count += value;
		notifyAllObservers();
	}

	@Override
	public void attach(Observer observer){
		observers.add(observer);		
	}
	
	@Override
	public void notifyAllObservers(){
		for (Observer observer : observers) {
			observer.update(count);
		}
	}
}
