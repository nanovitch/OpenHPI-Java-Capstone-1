package ca.openhpi.capstone1.patterns.observer;
public class Context {

	public static void main(String[] args) {
		
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver1(subject);
		Observer observer2 = new ConcreteObserver2(subject);
		
		subject.setValue(4);
		subject.setValue(22);
		subject.setValue(34);
		
	}
}