package ca.openhpi.capstone1.patterns.counter5.model;

import ca.openhpi.capstone1.patterns.counter5.view.AbstractView;

public interface Subject {
	public void attach(AbstractView observer);
	void notifyAllObservers();
}
