package functionalcourse.functional;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        String db = getDBConnection.get();
        System.out.println(db);
    }

    static Supplier<String> getDBConnection = () -> "localhost:1234";

}
