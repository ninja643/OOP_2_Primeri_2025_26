package rs.ac.ni.pmf.oop2.primeri.exceptions;

public class ExceptionsDemo {
    public static void main(final String[] args) {
        final Calculator calculator = new Calculator();

        double result = calculator.divide(10, 2);
        System.out.println(result);

        result = NumberInputReader.read();
        System.out.println(result);
    }
}
