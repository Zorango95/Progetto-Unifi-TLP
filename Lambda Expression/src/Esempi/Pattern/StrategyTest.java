package Esempi.Pattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrategyTest {

	private Vendable v;
	private double base = 100;
	@BeforeEach
	void setUp() throws Exception {
		v=new Vendable(base);
	}

	@Test
	void testDiscount() {
		v.setStrategy(new Strategy() {

			@Override
			public double getPrice(double base) {
				return 0.75*base;
			}
			
		});
		double price1=v.getPriceWithStrategy();
		double price2=v.getPriceWithLambda((x)->(0.75*x));
		assertEquals(price1,price2);
	}

}
