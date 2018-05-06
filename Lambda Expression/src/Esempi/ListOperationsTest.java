package Esempi;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ListOperationsTest {

	private ListOperations<Integer> listOp=new ListOperations<>();
	private int N=20;
	private int sum=0;
	
	@Test
	public void testSum() {
		for(int i=1; i<=N;i++)
			listOp.add(i);
		listOp.forEach((x)->{
			sum+=x;
		});
		assertEquals((N*(N+1)/2),sum);
	}

}
