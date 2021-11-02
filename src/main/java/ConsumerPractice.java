import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerPractice {

    static class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Consumer<Person> printName = p -> System.out.println(p.name);
        List<Person> persons = Arrays.asList(
                new Person("Gonza"),
                new Person("Santi"),
                new Person("Naza")
        );
        persons.forEach(printName);

        String s = null;
        String opt = Optional.ofNullable("xd").orElseGet(() -> "gonza");
        System.out.println(opt);
    }


}
