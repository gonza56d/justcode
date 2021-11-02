package functionalcourse.functional;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        String phoneNumber = "3511233";
        System.out.println(isPhoneNumberCba.test(phoneNumber));
        System.out.println(isPhoneNumberCba.and(isPhoneNumberValid).test(phoneNumber));
    }

    static Predicate<String> isPhoneNumberCba = pn -> pn.startsWith("351");
    static Predicate<String> isPhoneNumberValid = pn -> pn.length() > 8;

}
