package ca.openhpi.capstone1.patterns.observer;

public abstract class Observer {
	public Observer(Subject subject) {
		subject.attach(this);
	}
	
	public abstract void update();
}
