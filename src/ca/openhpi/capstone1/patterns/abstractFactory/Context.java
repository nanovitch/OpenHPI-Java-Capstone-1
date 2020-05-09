package ca.openhpi.capstone1.patterns.abstractFactory;

public class Context {

	public static void main(String[] args) {
		
		String type = "B";
		AbstractFactory factory;
		
		if ("A".equals(type)) {
			factory = new FactoryA();
			factory.createProductX(); 
			factory.createProductY(); 
		} else {
			factory = new FactoryB();
			factory.createProductX(); 
			factory.createProductY(); 
		}
	}

}
