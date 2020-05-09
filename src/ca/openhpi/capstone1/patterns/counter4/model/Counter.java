package ca.openhpi.capstone1.patterns.counter4.model;

import java.util.ArrayList;
import java.util.List;

import ca.openhpi.capstone1.patterns.counter4.view.View;

public class Counter implements Subject{

	private List<View> observers = new ArrayList<View>();
	private int count = 0;

	public void updateCount(int value) {
		this.count += value;
		notifyAllObservers();
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public void attach(View observer) {
		observers.add(observer);
	}
	
	@Override
	public void notifyAllObservers() {
		for (View observer : observers) {
			observer.update((Object)count);
		}
	}
}
