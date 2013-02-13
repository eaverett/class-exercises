package edu.macalester.cs124;

import acm.program.ConsoleProgram;

public class PrimeTest extends ConsoleProgram {
    public void run() {
        println(largestPrimeLessThan(26));
    }
    
    
    // Alternative implementation #1: broken into two methods
    
    public int largestPrimeLessThan(int n) {
        for(int candidate = n - 1; candidate > 0; candidate--) {
            if(isPrime(candidate)) {
                return candidate;
            }
        }
        return -1;
    }
    
    public boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    
    // Alternative implementation #2: one big method
    //
    // In addition to forming a tangle that is hard to read,
    // note how we have to create an extra variable called
    // isPrime. Why? Because in the version above, we return
    // true or false from isPrime. In the version below,
    // "return" would return from the whole method, but we
    // only want to return out of the inner loop.
    
    public int altLargestPrimeLessThan(int n) {
        for(int candidate = n - 1; candidate > 0; candidate--) {
            boolean isPrime = true;
            for(int divisor = 2; divisor < candidate; divisor++) {
                if(candidate % divisor == 0)
                    isPrime = false;
            }
            if(isPrime)
                return candidate;
        }
        return -1;
    }
}

