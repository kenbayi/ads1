public class FindAvg {
    /**
     * This method used for calculate average value from the array.
     * It is just iteration through array.
     * adding each value to variable and dividing it to length of array.
     * Time complexity: O(n), where n is length of array.
     * @param arr is array which is come from Main.java file.
     * @return the average value from the array.
     */
    public double findAvg(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        return (double) sum / arr.length;
    }
}
