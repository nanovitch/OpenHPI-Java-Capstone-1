package ca.openhpi.capstone1.patterns.counter5.model;

import java.util.ArrayList;
import java.util.List;

import ca.openhpi.capstone1.patterns.counter5.view.AbstractView;

public class Counter implements Subject{

	private int count = 0;
	private List<AbstractView> observers = new ArrayList<AbstractView>();

	public void updateCount(int value) {
		this.count += value;
		notifyAllObservers();
	}
	
	public int getCount() {
		return count;

	}
	
	@Override
	public void attach(AbstractView observer){
		observers.add(observer);		
	}
	
	@Override
	public void notifyAllObservers(){
		for (AbstractView observer : observers) {
			observer.update(count);
		}
	}
}
