public class BinomialCoefficient {
    /**
     * This method calculates the binomial coefficient (n choose k) using recursion.
     * It implements the formula: C(n, k) = C(n - 1, k - 1) + C(n - 1, k)
     * Time complexity: O(2^n), where n is the larger of n and k.
     * According to meaning of formula which is selection.
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient (n choose k).
     */
    public int calculateCoefficient(int n, int k){
        if(k == n || k == 0)
            return 1;
        return calculateCoefficient(n - 1, k - 1) + calculateCoefficient(n-1, k );
    }
}
