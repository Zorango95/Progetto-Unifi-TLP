import java.util.function.Function;

public class Curry {
    public int sum(int a, int b) {
        Function<Integer,Function<Integer,Integer>> f;
        f=(x)->((y)->(x+y));
        return f.apply(a).apply(b);
    }
}
