package Esempi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurryLambdaTest {

	@Test
	void testCurry() {
		CurryLambda cl = new CurryLambda();
		int x = 5;
		int y = 6;
		assertEquals(11, cl.sum(x, y));
	}

}