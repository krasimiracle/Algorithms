package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 25-Dec-16.
 */

public enum RecursiveExponentiation {
    INSTANCE;

    /**
     * Recursive exponentiation of number 'a' on power 'n'.
     *
     * @param a Number for exponentiation.
     * @param n Exponent.
     * @return Returns result of the exponentiation 'a' on the power 'n'.
     */

    /* Running time is  O(log n) */
    public double pow(double a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;
        double t = pow(a, n / 2);
        return t * t * pow(a, n % 2);
    }
}
