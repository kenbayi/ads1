public class Factorial {
    /**
     * This method calculates the factorial of given number.
     * The recursive algorithm iterates through all numbers from n to 1.
     * Time complexity: O(n), where n is input number
     * @param n The number for which the factorial is to be calculated.
     * @return the factorial of the given number
     */
    public int factorial(int n){
        if(n == 1)
            return 1;
        return factorial(n - 1) * n;
    }
}
