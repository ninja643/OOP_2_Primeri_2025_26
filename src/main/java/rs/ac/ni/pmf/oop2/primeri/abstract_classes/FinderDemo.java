package rs.ac.ni.pmf.oop2.primeri.abstract_classes;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FinderDemo {
    public static void main(final String[] args) {
        final List<Integer> numbers = List.of(1, 2, 3, 4, 6, 7, 8, 9);

        final MaxElementFinder maxFinder = new MaxElementFinder(numbers);
        System.out.println(maxFinder.find());

        final ClosestElementFinder closestFinder = new ClosestElementFinder(numbers, 5);
        System.out.println(closestFinder.find());

        final MinElementFinder minFinder = new MinElementFinder(Collections.emptyList());
        final Optional<Integer> min = minFinder.find();

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("No elements found!");
        }
        ;
    }
}
