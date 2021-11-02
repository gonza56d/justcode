package functionalcourse.imperative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person: people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        System.out.println(females);

        // Declarative approach
        females = people.stream()
                .filter(p -> Gender.FEMALE.equals(p.gender))
                .collect(Collectors.toList());
        System.out.println(females);
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
