package ca.openhpi.capstone1.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	int value = 0;
	
	public void setValue(int value) {
		this.value = value;
		notifyAllObservers();
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);	
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);	
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
