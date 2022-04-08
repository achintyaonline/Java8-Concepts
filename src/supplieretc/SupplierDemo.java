package supplieretc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "I am from supplier";
        System.out.println(supplier.get());

        List<Object> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"Nothing found"));

    }
}
