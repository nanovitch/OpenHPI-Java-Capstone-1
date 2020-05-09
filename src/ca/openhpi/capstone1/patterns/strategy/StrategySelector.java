package ca.openhpi.capstone1.patterns.strategy;

public class StrategySelector {
	Strategy strategy1;
	Strategy strategy2;
	Strategy strategy3;

	public StrategySelector() {
		strategy1 = new ConcreteStrategy1();
		strategy2 = new ConcreteStrategy2();
		strategy3 = new ConcreteStrategy3();
	}

	public Strategy getStrategy(int strategy) {
		Strategy selectedStrategy;
		switch(strategy) {
		case 1: selectedStrategy = strategy1; break;
		case 2: selectedStrategy = strategy2; break;
		case 3: selectedStrategy = strategy3; break;
		default: selectedStrategy = strategy1;
		}
		return selectedStrategy;
	}

	/*
	 * switch/case is basically a short form for if/else/elseif
	 * 
	 * if (strategy == 1) {
	 *    selectedStrategy = strategy1;
	 * } elseif (strategy == 2) {
	 *    selectedStrategy = strategy2;
	 * } elseif (strategy == 3) {
	 *    selectedStrategy = strategy3;
	 * } else {
	 *    selectedStrategy = strategy1;
	 * }
	 */

}
