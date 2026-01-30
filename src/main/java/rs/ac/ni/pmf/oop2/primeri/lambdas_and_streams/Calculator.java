package rs.ac.ni.pmf.oop2.primeri.lambdas_and_streams;

import java.util.function.BiFunction;

public class Calculator {
    public int execute(
            final BiFunction<Integer, Integer, Integer> operation,
            final int a,
            final int b) {
        return operation.apply(a, b);
    }
}
