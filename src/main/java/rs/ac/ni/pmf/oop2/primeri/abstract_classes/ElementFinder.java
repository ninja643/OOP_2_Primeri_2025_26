package rs.ac.ni.pmf.oop2.primeri.abstract_classes;

import java.util.List;
import java.util.Optional;

public abstract class ElementFinder {
    private final List<Integer> numbers;

    public ElementFinder(final List<Integer> numbers) {
        this.numbers = numbers;
    }

    protected abstract boolean isBetterMatch(final Integer candidate, final Integer currentBest);

    public Optional<Integer> find() {
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }

        Integer bestMatch = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (isBetterMatch(numbers.get(i), bestMatch)) {
                bestMatch = numbers.get(i);
            }
        }

        return Optional.of(bestMatch);
    }
}
