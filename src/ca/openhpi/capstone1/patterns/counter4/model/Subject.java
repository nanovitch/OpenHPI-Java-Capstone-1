package ca.openhpi.capstone1.patterns.counter4.model;

import ca.openhpi.capstone1.patterns.counter4.view.View;

public interface Subject {
	void attach(View observer);
	void notifyAllObservers();
}
