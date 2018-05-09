package Esempi;

import java.util.function.Function;

public class CurryLambda {
	
	public int sum(int a, int b) {
		Function<Integer, Function<Integer, Integer>> f;
		f = (x) -> (y) -> (x + y);
		return f.apply(a).apply(b);
	}
}
