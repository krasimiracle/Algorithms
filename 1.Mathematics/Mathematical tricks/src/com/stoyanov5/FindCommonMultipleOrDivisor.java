package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 25-Dec-16.
 */

public enum FindCommonMultipleOrDivisor {
    INSTANCE;

    public int findGreatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return findGreatestCommonDivisor(b, a % b);
    }

    public int findLeastCommonMultiple(int a, int b) {
        return b * a / findGreatestCommonDivisor(a, b);
    }
}
