package syntax.lesson5.variables;

public class Variables {
    static void main() {
        byte byteNumber = 127;
//        System.out.println(Integer.parseInt("11111111", 2));
        System.out.println("The byte number: " + byteNumber);

        //Short 2^16
        short shortNumber = 500;
        System.out.println("The short number: " + shortNumber);

        //int^32
        int intNumber = 500000000;
        System.out.println("The int number: " + intNumber);

        //2^64
        long longNumber = 888_888_888_888_888_888L;
        System.out.println("The long number: " + longNumber);

        //float
        float floatNumber = 3.14f;
        System.out.println("The float number: " + floatNumber);

        //double
        double doubleNumber = 3.555554487484;
        System.out.println("The double number: " + doubleNumber);

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.isNaN(23 / 1.0));

        char charSymbol = 'a';
        System.out.println("The char variable: " + charSymbol);

        boolean booleanVariable = true;
        booleanVariable = false;
        System.out.println("The boolean variable: " + booleanVariable);

        //casting
        short varForCasting = byteNumber;
        System.out.println("After casting varForCasting: " + varForCasting);

        int intNewVar = varForCasting;
        System.out.println("After casting intNewVar: " + intNewVar);

        int intVariable = 6_000_012;
        byte byteNewVar = (byte) intVariable;
        System.out.println("After casting int to byte: " + byteNewVar);

        var doubleVar = 4.18;
        int newInteger = (int) doubleVar;
        System.out.println("After casting double to int: " + newInteger);
    }
}
