import java.util.function.Function;

public class Curry {
    public int sum(int x, int y) {
        Function<Integer,Function<Integer,Integer>> f;
        f=(x)->((y)->(x+y));
        return f.apply(2).apply(3);
    }
}
