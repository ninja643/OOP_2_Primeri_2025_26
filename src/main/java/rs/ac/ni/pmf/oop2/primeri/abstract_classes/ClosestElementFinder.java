package rs.ac.ni.pmf.oop2.primeri.abstract_classes;

import java.util.List;

public class ClosestElementFinder extends ElementFinder {
    private final int target;

    public ClosestElementFinder(final List<Integer> numbers, final int target) {
        super(numbers);
        this.target = target;
    }

    @Override
    protected boolean isBetterMatch(final Integer candidate, final Integer currentBest) {
        return Math.abs(candidate - target) < Math.abs(currentBest - target);
    }
}
