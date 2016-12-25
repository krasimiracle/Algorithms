package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 25-Dec-16.
 */

public enum RecursiveExponentiation {
    INSTANCE;

    public double pow(double a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;
        double t = pow(a, n / 2);
        return t * t * pow(a, n % 2);
    }
}
