package ca.openhpi.capstone1.patterns.composite;

public class Leaf extends Component {
	
	private String type;
	
	public Leaf(String type) {
		this.type = type;
	}
	
	@Override
	public void operation() {
		//do something
	}
	
	@Override
	public String toString() {
		return type + System.lineSeparator();
	}
}
