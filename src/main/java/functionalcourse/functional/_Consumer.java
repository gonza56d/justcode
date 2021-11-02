package functionalcourse.functional;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "1234");
        greetCustomer(maria);

        Consumer<Customer> greetCustomer = c -> System.out.println("Hello " + c.name + "!");
        greetCustomer.accept(maria);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + "!");
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

}
