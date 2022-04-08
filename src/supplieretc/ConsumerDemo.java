package supplieretc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hi from consumer");

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        integers.stream().forEach(integer -> System.out.println(integer));
    }
}
