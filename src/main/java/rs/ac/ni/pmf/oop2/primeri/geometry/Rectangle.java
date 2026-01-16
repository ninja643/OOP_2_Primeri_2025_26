package rs.ac.ni.pmf.oop2.primeri.geometry;

public class Rectangle implements Printable {
    protected double a;
    protected double b;

    protected String label;

    public Rectangle(final double a, final double b) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public void printInfo()
    {
        System.out.println(label);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
