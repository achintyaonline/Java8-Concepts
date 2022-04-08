package supplieretc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = integer -> integer%2 ==0;
        System.out.println("Is even: "+predicate.test(5));
        System.out.println("Is even: "+predicate.test(6));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //Print only even numbers form above list
        integers.stream().filter(integer -> integer%2 ==0).forEach(System.out::println);
    }
}
