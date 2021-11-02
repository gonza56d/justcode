import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeStreams {

    private static class Employee {
        private int id;
        private String name;
        private float cash;

        public Employee(int id, String name, float cash) {
            this.id = id;
            this.name = name;
            this.cash = cash;
        }
        public static boolean isJeff(Employee employee) {
            return employee.name.equals("Jeff Bezos");
        }
    }

    private static Employee[] arrayOfEmployees = {
            new Employee(1, "Jeff Bezos", 12349.0f),
            new Employee(2, "Bill Gates", 3214f),
            new Employee(3, "Mark Zuckerberg", 2142143f)
    };

    public static void main(String[] args) {
        List<Employee> s = Stream.of(arrayOfEmployees)
                .filter(e -> e.name.startsWith("J"))
                .collect(Collectors.toList());
        s.forEach(e -> System.out.println(e.name));
    }

}
