public class Main {

    public static void main(String[] args) {

        // 1. char (Primitive Type) - Character (Wrapper Class)

        // Initializing a variable of type "char".
        char myChar = 'D';
        System.out.println(myChar);

        // "char" variable also stores Unicode characters.
        char myUnicodeChar = '\u0044';    // Represents the English letter "D".
        System.out.println(myUnicodeChar);

        // Stores a copyright symbol.
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // 2. boolean (Primitive Type) - Boolean (Wrapper Class)

        // Initializing a variable of type "boolean" storing value "true".
        boolean myTrueBoolean = true;
        System.out.println(myTrueBoolean);

        // Initializing a variable of type "boolean" storing value "false".
        boolean myFalseBoolean = false;
        System.out.println(myFalseBoolean);

        // Variable stores whether a customer is above the age of 21.
        boolean isCustomerOverTwentyOne = true;
        System.out.println("Is customer over the age of 21? - " + isCustomerOverTwentyOne);
    }
}
