public class Power {
    /**
     * This method calculates the power of a number using recursion.
     * It computes 'a' raised to the power of 'n'.
     * Time complexity: O(log n), where n is the exponent.
     * @param a The base number.
     * @param n The exponent.
     * @return The result of 'a' raised to the power of 'n'.
     */
    public int power(int a, int n){
        int holder;
        if(n == 0)
            return 1;
        if(n % 2 == 0){
            holder = power(a, n / 2);
            return holder * holder;
        }else
            return a * power(a, n -1);
    }
}
