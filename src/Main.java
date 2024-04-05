import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        FindMin findMin = new FindMin();
        FindAvg findAvg = new FindAvg();
        System.out.println("Minimum from the array is: " + findMin.findMin(arr));
        System.out.println("Average value from the arrays is: " + findAvg.findAvg(arr));
    }
}