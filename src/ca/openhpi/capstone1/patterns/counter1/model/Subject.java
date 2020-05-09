package ca.openhpi.capstone1.patterns.counter1.model;

import ca.openhpi.capstone1.patterns.counter1.view.Observer;

public interface Subject {
	void attach(Observer observer);
	void notifyAllObservers();
}
