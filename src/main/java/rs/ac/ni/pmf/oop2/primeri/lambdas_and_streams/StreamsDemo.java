package rs.ac.ni.pmf.oop2.primeri.lambdas_and_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main2(final String[] args) {
        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -12);

        final int sum1 = evenNumbersDoubled(numbers.stream())
                .sum();

        final OptionalInt max1 = evenNumbersDoubled(numbers.stream())
                .max();

        final boolean isEvenInList = numbers.stream()
                .anyMatch(e -> e % 2 == 0);

//        System.out.println(sum1);
//
//        final int sum2 = squareDivisibleBy3(numbers.stream())
//                .mapToInt(e -> e)
//                .sum();
//
//        System.out.println(sum2);

//        final int sum3 =
//                squareDivisibleBy3(evenNumbersDoubled(numbers.stream()))
//                        .mapToInt(e -> e)
//                        .sum();
//
//        System.out.println(sum3);
    }

    private static IntStream evenNumbersDoubled(final Stream<Integer> numbers) {
        return numbers
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> 2 * e);
    }

    private static Stream<Integer> squareDivisibleBy3(final Stream<Integer> numbers) {
        return numbers
                .filter(e -> e % 3 == 0)
                .map(e -> e * e);
    }

    public static void main3(final String[] args) {
        final List<Long> numbers = List.of(
                1_234_567_890L,
                1_234_567_890_123_456_789L);

        numbers.stream()
                .flatMap(StreamsDemo::digits)
                .forEach(System.out::print);

        System.out.println();
        /*final String result = */
        final var result = numbers.stream()
                .flatMap(StreamsDemo::digits)
//                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum))
//                .map(String::valueOf)
//                .collect(Collectors.joining(", ", "{", "}"))
                .mapToInt(e -> e)
                .sum();

        System.out.println(result);

        final Optional<Integer> optiaonlNumber = check(result);

        if (optiaonlNumber.isPresent()) {
            final int value = optiaonlNumber.get();
            System.out.println(value);
        } else {
            System.out.println("Not an even number!");
        }

        final int value = optiaonlNumber
                .map(e -> e + 1)
                .orElse(0);
        System.out.println(value);


    }

    private static Stream<Integer> digits(final long number) {
        if (number == 0) {
            return Stream.of(0);
        }

        final List<Integer> digits = new ArrayList<>();
        long temp = number;
        while (temp > 0) {
            digits.add((int) (temp % 10));
            temp /= 10;
        }

        return digits.reversed().stream();
    }

    private static Optional<Integer> check(final int a) {
        return a % 2 == 0 ? Optional.of(a) : Optional.empty();
    }

    private static Optional<String> normalize(final String s) {
        return Optional.of(s.trim().toUpperCase());
    }

    public static void main4(final String[] args) {
        final Optional<String> input = Optional.of("   Hello World!   ");
        final Optional<String> normalized = input
                .flatMap(StreamsDemo::normalize);

        normalized.ifPresent(System.out::println);
    }

    public static void main(String[] args) {
//        final List<Integer> numbers = IntStream.rangeClosed(1, 10_000).boxed().toList();
//
//        final int sum = numbers
//                .parallelStream()
//                .reduce(1, Integer::sum);
//
//        System.out.println(sum);
        System.out.println(check());
    }

    private static int check()
    {
        try {

            throw new RuntimeException();
        }
        finally {
            return 2;
        }
    }
}
