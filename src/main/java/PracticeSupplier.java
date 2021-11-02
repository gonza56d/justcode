import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class PracticeSupplier {

    static String product = "Pc with Ubuntu :)";

    public static void main(String[] args) {

        //shitty examples
        Supplier<Boolean> booleanSupplier = () -> product.length() < 1;
        Supplier<Integer> integerSupplier = () -> product.length() + 1;
        Supplier<String> stringSupplier = () -> product.toUpperCase(Locale.ROOT);

        //cool example
        Supplier<Boolean> hasText = () -> product != null && !product.isEmpty();

        System.out.println(hasText.get());

        product = "";

        System.out.println(hasText.get());


        ///
        Supplier<Integer> supplier = PracticeSupplier::getTwoDigitRandom;

        System.out.println(supplier.get());

    }

    public static Integer getTwoDigitRandom() {

        int random = new Random().nextInt(100);

        if(random < 10)
            return 10;

        return random;
    }

}
