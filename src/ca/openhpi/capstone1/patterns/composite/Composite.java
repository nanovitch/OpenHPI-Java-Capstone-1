package ca.openhpi.capstone1.patterns.composite;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> children;
	private String type;
	
	public Composite(String type) {
		this.type = type;
		children = new ArrayList<>();
	}
	
	public void add(Component component) {
		children.add(component);
	}
	
	public void remove(Component component) {
		children.remove(component);
	}
	
	public Component getChild(int index) {
		return children.get(index);
	}
	
	@Override
	public void operation() {
		//do something
	}
	
	@Override
	public String toString() {
		String out = "start " + type + "------------------" + System.lineSeparator();
		for (Component child : children) {
			out += child;
		}
		out += "end " + type + "------------------" + System.lineSeparator();
		return out;
	}
}
