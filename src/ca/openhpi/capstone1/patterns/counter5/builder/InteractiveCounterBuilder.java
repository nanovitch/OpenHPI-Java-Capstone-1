package ca.openhpi.capstone1.patterns.counter5.builder;

import ca.openhpi.capstone1.patterns.counter5.starter.TheApp;
import processing.core.PApplet;

public class InteractiveCounterBuilder implements Builder {

	InteractiveCounter iCounter;
	PApplet applet;
	
	public InteractiveCounterBuilder(TheApp applet) {
		iCounter = new InteractiveCounter();
		this.applet = applet;
	}
	
	@Override
	public void buildComponent() {
		buildModel();
		buildView(applet);
		buildController();
	}

	@Override
	public void buildModel() {
		iCounter.addModel();
	}

	@Override
	public void buildView(PApplet applet) {
		iCounter.createViews(applet);
	}

	@Override
	public void buildController() {
		iCounter.addController();
	}

	@Override
	public InteractiveComponent getComponent() {
		return iCounter;
	}

}
