package com.stoyanov5;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        // Numbers for testing
        final int number = 4;
        final int number2 = 6;

        /* 1.Finds all prime numbers from a number */
        //boolean[] primes = FindPrimes.INSTANCE.findPrimes(number);
        //
        //System.out.println("All prime numbers contained in " + ANSI_RED + number + ANSI_RESET + " are:");
        //for (int i = 0; i <= number; i++) {
        //    if (primes[i]) {
        //        System.out.println(i);
        //    }
        //}

        /* 2.Finds the greatest common divisor of two numbers */
        //int greatestCommonDivisor = FindCommonMultipleOrDivisor.INSTANCE.findGreatestCommonDivisor(number, number2);
        //
        //System.out.println("The greatest common divisor of numbers: " + ANSI_RED +
        //        number + ANSI_RESET + " and " + ANSI_RED +
        //        number2 + ANSI_RESET + " is: " + ANSI_RED +
        //        greatestCommonDivisor + ANSI_RESET);

        /* 3.Finds the Lowest common multiple of two numbers */
        //int leastCommonMultiple = FindCommonMultipleOrDivisor.INSTANCE.findLeastCommonMultiple(number, number2);
        //
        //System.out.println("The least common multiple of numbers: " + ANSI_RED +
        //        number + ANSI_RESET + " and " + ANSI_RED +
        //        number2 + ANSI_RESET + " is: " + ANSI_RED +
        //        leastCommonMultiple + ANSI_RESET);

        /* 4.Base operations */
        //System.out.println("The number is: " + ANSI_RED + number + ANSI_RESET);

        //int binaryToDecimal = Integer.parseInt("" + number, 2);
        //System.out.println("Number to base-10 numeral system: " + binaryToDecimal);

        //String decimalToBinary = Integer.toBinaryString(number);
        //System.out.println("Number to binary: " + decimalToBinary);

        //String decimalToOctal = Integer.toOctalString(number);
        //System.out.println("Number to base-8 numeral system: " + decimalToOctal);

        //String decimalToHex = Integer.toHexString(number);
        //System.out.println("Number to base-16 numeral system: " + decimalToHex);

        /* 5.Fast Exponentiation */
        //double result = RecursiveExponentiation.INSTANCE.pow(number, number2);
        //System.out.println("Result of raised number is: " + result);
    }
}
