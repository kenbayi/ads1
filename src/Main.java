import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime(); //calling class to use method isPrime
        FindMin findMin = new FindMin(); //calling class to use method find minimum
        FindAvg findAvg = new FindAvg(); //calling class to use method find average
        Factorial factorial = new Factorial(); //calling class to use method factorial
        Scanner sc = new Scanner(System.in);

        //to test 3rd and 4th task
        int num = sc.nextInt();
        System.out.println("The number is " + ((isPrime.isPrime(num)) ? "Prime" : "Composite"));
        System.out.println("The factorial is " + factorial.factorial(num));

        //to test 1st and 2nd task
        int n = sc.nextInt();

        //declaring array and input numbers to array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum from the array is: " + findMin.findMin(arr));
        System.out.println("Average value from the arrays is: " + findAvg.findAvg(arr));
    }
}