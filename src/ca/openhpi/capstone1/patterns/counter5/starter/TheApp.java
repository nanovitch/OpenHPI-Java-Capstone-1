package ca.openhpi.capstone1.patterns.counter5.starter;


//import ca.openhpi.capstone1.patterns.counter5.builder.GUIComponent;
import ca.openhpi.capstone1.patterns.counter5.builder.InteractiveComponent;
import ca.openhpi.capstone1.patterns.counter5.builder.InteractiveCounterBuilder;
import processing.core.PApplet;

public class TheApp extends PApplet {

	InteractiveComponent interactiveCounter;

	@Override
	public void settings() {
		size(200, 200);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		InteractiveCounterBuilder builder = new InteractiveCounterBuilder(this);
		builder.buildComponent();
		//GUIComponent.construct(this, builder);
		interactiveCounter = builder.getComponent();
	}

	@Override
	public void draw() {  // draw() loops forever, until stopped
		background(204);
		//fill(255);
		//rect(random(100),random(100), 10, 10);
		//interactiveCounter.handleEvent();;
	}
	
	@Override
	public void mouseClicked() {
		interactiveCounter.handleEvent();
	}
}
