package functionalcourse.functional;

import java.util.function.Consumer;

public class _Callbacks {

    public static void main(String[] args) {
        salutation("Gonza", "Garcia", value -> {
            System.out.println("Hello " + value + "!");
        });
    }

    static void salutation(String firstName, String lastName, Consumer<String> callback) {
        if (firstName == null || lastName == null) {
            System.out.println("First name and last name must be provided");
        } else {
            callback.accept(firstName + " " + lastName);
        }
    }

}
