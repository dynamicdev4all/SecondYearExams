import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.forEach(null);

        Stream<String> s = list.stream();

        s.filter(null);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // filter
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println); // Output: 2 4 6

        // map
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println); // Output: 1 4 9 16 25 36

        // foreach
        numbers.stream()
                .forEach(n -> System.out.print(n + " ")); // Output: 1 2 3 4 5 6

        // collection
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens); // Output: [2, 4, 6]


        // sort
        List<Integer> unsorted = Arrays.asList(5, 1, 4, 3, 2);
        unsorted.stream()
                .sorted()
                .forEach(System.out::print); // Output: 12345

        // distinct
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        nums.stream()
                .distinct()
                .forEach(System.out::print); // Output: 12345

        // limit
        numbers.stream()
                .limit(3)
                .forEach(System.out::println); // Output: 1 2 3

        // skip
        numbers.stream()
                .skip(3)
                .forEach(System.out::println); // Output: 4 5 6

        // count
        long evenCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(evenCount); // Output: 3

        // reduce

        int sum = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a + b);
        System.out.println(sum); // Output: 21

    }
}
