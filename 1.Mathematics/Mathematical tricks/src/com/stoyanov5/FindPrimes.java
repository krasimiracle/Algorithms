package com.stoyanov5;

import java.util.Arrays;

/**
 * Created by Krasimir Stoyanov on 25-Dec-16.
 */

public enum FindPrimes {
    INSTANCE;

    public boolean[] findPrimes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        int m = (int) Math.sqrt(n);

        for (int i = 2; i <= m; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}
