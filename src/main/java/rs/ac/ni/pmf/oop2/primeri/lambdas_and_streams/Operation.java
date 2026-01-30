package rs.ac.ni.pmf.oop2.primeri.lambdas_and_streams;

@FunctionalInterface
public interface Operation {
    int apply(int a, int b);

    default boolean test(int a) {

        return true;
    }
}
