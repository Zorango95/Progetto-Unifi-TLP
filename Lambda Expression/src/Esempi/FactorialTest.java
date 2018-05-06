package Esempi;

import static org.junit.Assert.*;

import org.junit.Test;


public class FactorialTest {

	private Factorial fact = new Factorial();
	@Test
	public void testZero(){
		assertEquals(1,fact.getFactorial(0));
	}
	@Test
	public void test() {
		for(int i=1; i<10;i++){
			assertEquals(i*fact.getFactorial(i-1),fact.getFactorial(i));
		}
	}

}
