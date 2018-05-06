package Esempi.Pattern;

import java.util.function.Function;

public class Vendable {
	private Strategy s;
	private double basePrice;
	public Vendable(double base) {
		this.basePrice=base;
	}
	public void setStrategy(Strategy s) {
		this.s=s;
	}
	public double getPriceWithStrategy() {
		return s.getPrice(basePrice);
	}
	public double getPriceWithLambda(Function<Double,Double> s) {
		return s.apply(basePrice);
	}
	
}