package functionalcourse.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int impResult = increment(1);
        int funcResult = incrementFunction.apply(1);

        System.out.println(impResult);
        System.out.println(funcResult);

        System.out.println(incrementFunction.andThen(multiplyBy10).apply(3));

        System.out.println(incrementThenMultiply.apply(3, 10));
    }

    static Function<Integer, Integer> incrementFunction =
            x -> x + 1;

    static Function<Integer, Integer> multiplyBy10 =
            x -> x * 10;

    static BiFunction<Integer, Integer, Integer> incrementThenMultiply =
            (x, y) -> (x + 1) * y;

    static int increment(int number) {
        return number + 1;
    }

}
