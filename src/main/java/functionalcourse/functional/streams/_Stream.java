package functionalcourse.functional.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        people.stream()
                .filter(p -> Gender.FEMALE.equals(p.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println(
                people.stream()
                        .noneMatch(p -> Gender.MALE.equals(p.gender))
        );

        System.out.println(people.stream().anyMatch(p -> "John".equals(p.name)));
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }

}
