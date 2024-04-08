public class Fibonacci {
    /**
     * This method calculates the nth Fibonacci number recursively.
     * It sums up the (n-1)th and (n-2)th Fibonacci numbers to calculate the nth Fibonacci number.
     * Time complexity: Exponential, O(2^n), as it recursively calculates Fibonacci numbers.
     * @param n The index of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public int fibonacci(int n){
        if(n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
