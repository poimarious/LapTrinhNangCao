// Import your library
// Do not change the name of the Solution class
public class Solution {
    private static long[] fib = new long[101];
    static {
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= 100; i++) {fib[i] = -1;}
    }
    public static long fibonacci(int n) {
        if(fib[n] != -1) return fib[n];
        try {
            fib[n] = Math.addExact(fibonacci(n-1), fibonacci(n-2));
        } catch(ArithmeticException e) {
            fib[n] = Long.MAX_VALUE;
        }
        return fib[n];
    }
} 