public class GreatestCommonDivisor {
    /**
     * This method calculates the greatest common divisor (GCD) of two numbers using the Euclidean Algorithm.
     * If a is greater than b, subtract b from a and call calculateGCD recursively with the result and b.
     * If b is greater than a, subtract a from b and call calculateGCD recursively with a and the result.
     * Time complexity of algorithm would be proportional number of steps required to reduce b to 0.
     * Time complexity: O(log min(a, b)), where a and b are the input numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor (GCD) of a and b.
     */
    public int calculateGCD(int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b) {
            if (a % b == 0)
                return b;
            return calculateGCD(a - b, b);
        }
        if (b % a == 0)
            return a;
        return calculateGCD(a, b - a);
    }
}
