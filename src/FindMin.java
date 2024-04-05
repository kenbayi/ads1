public class FindMin {
    /**
     * This method used for calculate minimum value from the array.
     * It is just iteration through array.
     * and comparing each value from the array.
     * Time complexity: O(n), where n is length of array.
     * @param arr is array which is come from Main.java file.
     * @return the minimum value from the array.
     */
   public int findMin(int[] arr){
       int min = arr[0];
       for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
       }
       return min;
   }
}
