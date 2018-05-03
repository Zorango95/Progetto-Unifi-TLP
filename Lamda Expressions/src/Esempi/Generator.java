package Esempi;

import java.util.function.Function;


public class Generator<T> {
	private int act=0;
	private Function<Integer,T> f;
	public Generator(Function<Integer,T> f) {
		this.f=f;
	}
	public T next() {
		return (f.apply(act++));
	}
	public static void main(String[] args) {
		
		Generator<Integer> sum=new Generator<>((n)->{
			int s=1;
			for(int i=1; i<=n;i++) {
				s*=i;
			}
			return s;
		});
		for(int i=0; i<=5; i++) {
			System.out.println(sum.next());
		}
	}
}
