package Esempi;

import java.util.function.Function;

interface SelfApplicable<T> {

	public T apply(SelfApplicable<T> a);

}

public class Factorial {

	public int getFactorial(int n) {

		SelfApplicable<Function<Function<Function<Integer, Integer>, Function<Integer, Integer>>, Function<Integer, Integer>>> Y = y -> f -> x -> f
				.apply(y.apply(y).apply(f)).apply(x);

		Function<Function<Function<Integer, Integer>, Function<Integer, Integer>>, Function<Integer, Integer>> Fix = Y
				.apply(Y);
		Function<Function<Integer, Integer>, Function<Integer, Integer>> F = factorial -> x -> x == 0 ? 1
				: x * factorial.apply(x - 1);
		Function<Integer, Integer> fixfactorial = Fix.apply(F);
		return fixfactorial.apply(n);
	}
}
