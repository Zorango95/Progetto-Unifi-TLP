package Esempi.Pattern;

import java.awt.Point;
import java.util.function.Function;

public class StrategyDiscount implements Strategy {

	
	@Override
	public double getPrice(double base) {
		Function<Integer,Integer> a = (x)->(x+1);
		return 0.75*base;
	}
	

}
