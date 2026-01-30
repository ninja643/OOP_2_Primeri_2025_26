package rs.ac.ni.pmf.oop2.primeri.lambdas_and_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;

public class LambdaDemo {
    public static void main(final String[] args) {
//        final Calculator calculator = new Calculator();
//
//        final int resultAdd = calculator.execute(Integer::sum, 10, 20);
//        final int resultMultiply = calculator.execute((a, b) -> a * b, 10, 20);
//
//        final int resultPow = calculator.execute(
//                (a, b) -> (int) Math.pow(a, b),
//                10,
//                2);
//
//        System.out.println(resultAdd);
//        System.out.println(resultMultiply);
//        System.out.println(resultPow);

//        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//
//        numbers.stream()
//                .map(String::valueOf)
//                .map(String::toString)
//                .forEach(System.out::println);
//        final List<Runnable> tasks = new ArrayList<>();
//
//        final int[] holder = {0};
//
//        for (int i = 0; i < 10; i++) {
//            holder[0] = i;
//            tasks.add(() -> System.out.println(holder[0]));
//        }
//
//        tasks.forEach(Runnable::run);

        final List<Point> points = new ArrayList<>(
                List.of(
                        new Point(4, 2),
                        new Point(5, 4),
                        new Point(3, 4),
                        new Point(5, 6))
        );

        final Point pivot = new Point(4, 4);

        final Comparator<Point> pointComparator =
                Comparator
//                        .comparingDouble((Point point) -> point.distance(pivot))
                        .<Point>comparingDouble(point -> point.distance(pivot))
//                        .comparingDouble((ToDoubleFunction<Point>) point -> point.distance(pivot))
                        .thenComparingDouble(Point::x)
//                        .comparingDouble(Point::x)
                ;

        points.sort(pointComparator);

        points.forEach(System.out::println);
    }
}
