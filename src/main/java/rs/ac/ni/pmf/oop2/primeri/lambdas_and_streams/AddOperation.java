package rs.ac.ni.pmf.oop2.primeri.lambdas_and_streams;

public class AddOperation implements Operation {
    @Override
    public int apply(final int a, final int b) {
        return a + b;
    }
}
