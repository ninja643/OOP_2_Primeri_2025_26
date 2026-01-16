package rs.ac.ni.pmf.oop2.primeri.geometry;

public class Square extends Rectangle {

    private double a;

    public Square(final double a) {
        super(a, a);

        this.a = 2 * a;

        label = "Square";
    }

    @Override
    public double getArea() {
        System.out.println("Calculating area of " + label);
        return super.getArea();
    }
}
