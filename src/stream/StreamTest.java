package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("pineapple");
        list.add("apple");
        list.stream()
                .filter(s -> s.endsWith("e"))
                // method reference
                .forEach(System.out::println);
    }
}
