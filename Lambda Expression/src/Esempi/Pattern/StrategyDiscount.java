package Esempi.Pattern;

import java.util.function.Function;

public class StrategyDiscount implements Strategy {

	
	@Override
	public double getPrice(double base) {
		return 0.75*base;
	}
	

}
