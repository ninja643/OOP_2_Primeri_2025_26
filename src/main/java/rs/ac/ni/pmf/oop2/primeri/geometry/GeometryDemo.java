package rs.ac.ni.pmf.oop2.primeri.geometry;

import java.util.ArrayList;
import java.util.List;

public class GeometryDemo {
    public static void main(final String[] args) {
        final Rectangle rectangle = new Rectangle(-10, 5);
        rectangle.setLabel("Rectangle");
        final Printable square = new Square(-10);
        final Printable sphere = new Sphere(10);

//        final List<Printable> figures = new ArrayList<>();
//        figures.add(rectangle);
//        figures.add(square);
//        figures.add(sphere);

        final List<Printable> figures = List.of(rectangle, square, sphere);

        printData(figures);
        printData(figures);
    }

    public static void printData(final List<Printable> figures)
    {
        System.out.println("================================================");

        for (final Printable figure : figures) {
            figure.printInfo();
        }

        figures.removeFirst();
    }
}
