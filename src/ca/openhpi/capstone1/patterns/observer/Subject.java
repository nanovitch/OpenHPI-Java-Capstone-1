package ca.openhpi.capstone1.patterns.observer;

public interface Subject {
	void attach(Observer observer);
	void detach(Observer observer);
	void notifyAllObservers();
}
