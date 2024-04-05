public class IsPrime {
    /**
     * This method defines is given number prime or not.
     * According to conditions, and calculations.
     * Time complexity: O(sqrt(n)), where n is number to define.
     * @param n The number to define prime or not.
     * @return True or False, depending on calculations
     */
    public boolean isPrime(int n){
        if(n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
