package Esempi.Pattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrategyTest {

	private double base = 100;

	@Test
	void testDiscount() {
		
		Vendable v = new Vendable(100);
		v.setStrategy((x)->(0.75*x));
		Strategy ss = new StrategyDiscount();
		v.setStrategy(ss);
		
		v.setStrategy(new Strategy() {

			@Override
			public double getPrice(double base) {
				return 0.75*base;
			}
			
		});
		
		double price1=v.getPriceWithStrategy();
		double price2=v.getPriceWithLambda((x)->(0.75*x));
		assertEquals(price1,price2);
		
		double price = v.getPriceWithStrategy();
		assertEquals(price1,price);

	}

}
