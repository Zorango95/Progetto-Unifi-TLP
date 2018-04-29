package Esempi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperazioniTest {

	@Test
	void testLambda() {
		OperazioniLambda op1 = new OperazioniLambda(10,50);
		
		assertEquals(10, op1.getIdentity(x -> {
			return x;
		}));

		IntFunProd ifProd = ((x,y) -> {
			return x * y;
		});
		assertEquals(500, op1.getValueOperation(ifProd));
		
		IntFunComp ifComp = ((x,y) -> {
			if (x==y) {
				return true;
			}else {
				return false;
			}
		});
		assertEquals(false, ifComp.comparable(op1.getX(), op1.getY()));
		op1.setX(50);
		assertEquals(true, ifComp.comparable(op1.getX(), op1.getY()));
	}

}
