package rs.ac.ni.pmf.oop2.primeri.abstract_classes;

import java.util.List;

public class MaxElementFinder extends ElementFinder {

    public MaxElementFinder(final List<Integer> numbers) {
        super(numbers);
    }

    @Override
    protected boolean isBetterMatch(final Integer candidate, final Integer currentBest) {
        return candidate > currentBest;
    }
}
