public class FindAvg {
    public double findAvg(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        return (double) sum / arr.length;
    }
}
