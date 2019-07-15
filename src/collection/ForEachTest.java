package collection;

import java.util.HashSet;
import java.util.Set;

public class ForEachTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(2);
        set.add("bread");
        set.add("sheng");
        for (String s : set) {
            if ("bread".equals(s)) {
                continue;
            }
            System.out.println(s);
        }
    }
}
