package ca.openhpi.capstone1.patterns.abstractFactory;

public class FactoryB extends AbstractFactory {
	@Override
	public ProductX createProductX() {
		return new ProductBX();
	}
	
	@Override
	public ProductY createProductY() {
		return new ProductBY();
	}
}
