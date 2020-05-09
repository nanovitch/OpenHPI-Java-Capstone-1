package ca.openhpi.capstone1.patterns.counter3.model;

import ca.openhpi.capstone1.patterns.counter3.view.Observer;

public interface Subject {
	public void attach(Observer observer);
	void notifyAllObservers();
}
