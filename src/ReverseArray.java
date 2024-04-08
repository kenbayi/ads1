public class ReverseArray {
    /**
     * This method reverses the elements of the given array.
     * It calls the reverse helper method with appropriate parameters.
     * Time complexity: O(n/2), where n is the length of the array.
     * @param arr The array to be reversed.
     */
    public void reverseArr(int[] arr){
        reverse(arr, 0, arr.length - 1);
    }
    /**
     * This is a helper method that recursively reverses the elements within the specified range of the array.
     * It swaps the elements at indices i and j, and then recursively calls itself with updated indices.
     * Time complexity: O(n/2), where n is the length of the array.
     * @param arr The array containing the elements to be reversed.
     * @param i The starting index of the range.
     * @param j The ending index of the range.
     */
    public void reverse(int[] arr, int i, int j){
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverse(arr, ++i, --j);
        }
    }
}
