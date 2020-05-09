package ca.openhpi.capstone1.patterns.abstractFactory;

public class FactoryA extends AbstractFactory{
		
	@Override
	public ProductX createProductX() {
		return new ProductAX();
	}
	
	@Override
	public ProductY createProductY() {
		return new ProductAY();
	}
}
