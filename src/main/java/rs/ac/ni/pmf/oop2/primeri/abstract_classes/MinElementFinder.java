package rs.ac.ni.pmf.oop2.primeri.abstract_classes;

import java.util.List;

public class MinElementFinder extends ElementFinder {

    public MinElementFinder(final List<Integer> numbers) {
        super(numbers);
    }

    @Override
    protected boolean isBetterMatch(final Integer candidate, final Integer currentBest) {
        return candidate < currentBest;
    }
}
