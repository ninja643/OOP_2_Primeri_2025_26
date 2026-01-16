package rs.ac.ni.pmf.oop2.primeri.geometry;

public class Sphere implements Printable {

    private final double r;

    public Sphere(final double r) {
        this.r = r;
    }

    public double area()
    {
        return 4 * Math.PI * r * r;
    }

    public double volume()
    {
        return (double) 4 / 3 * Math.PI * r * r * r;
    }


    @Override
    public void printInfo() {
        System.out.println("Sphere info:");
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}
