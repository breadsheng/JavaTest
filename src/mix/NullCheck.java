package mix;

import java.util.Optional;

public class NullCheck {

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Person person = null;
        Optional<Person> optionalPerson = Optional.ofNullable(person);
        optionalPerson.ifPresent(System.out::println);

        Person newPerson = optionalPerson.orElse(new Person("breadsheng"));
        System.out.println(newPerson.name);

        Person funPerson = optionalPerson.orElseGet(() -> new Person("breadsheng"));
        System.out.println(funPerson.name);
    }
}