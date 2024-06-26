import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IsPrime isPrime = new IsPrime(); //calling class to use method isPrime
        FindMin findMin = new FindMin(); //calling class to use method find minimum
        FindAvg findAvg = new FindAvg(); //calling class to use method find average
        Factorial factorial = new Factorial(); //calling class to use method factorial
        Fibonacci fibonacci = new Fibonacci(); //calling class to use method fibonacci
        ReverseArray reverse = new ReverseArray(); //calling class to use method reverseArr
        Power power = new Power(); //calling class to use method power
        DigitChecker digitChecker = new DigitChecker(); //calling class to use method isDigits
        BinomialCoefficient binomialCoefficient = new BinomialCoefficient(); //calling class to use method calculation
        GreatestCommonDivisor gcd = new GreatestCommonDivisor(); //calling class to use method calculateGCD
        Scanner sc = new Scanner(System.in);

        //to test 10th task
        int g, h;
        g = sc.nextInt();
        h = sc.nextInt();
        System.out.println("GCD is: " + gcd.calculateGCD(g, h));

        //to test 9th task
        int q, s;
        q = sc.nextInt();
        s = sc.nextInt();
        System.out.println("Binomial Coefficient is: " + binomialCoefficient.calculateCoefficient(q, s));
        //to test 8th task
        String words = sc.next();
        System.out.println("Is all digits?: " + digitChecker.isDigits(words));
        //to test 6th task
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The power: " + power.power(a, b));
        //to test 3rd and 4th task
        int num = sc.nextInt();
        System.out.println("The number is: " + ((isPrime.isPrime(num)) ? "Prime" : "Composite"));
        System.out.println("The factorial is: " + factorial.factorial(num));
        System.out.println("Fibonacci sequence value is: " + fibonacci.fibonacci(num));

        //to test 1st, 2nd and 7th task
        int n = sc.nextInt();

        //declaring array and input numbers to array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum from the array is: " + findMin.findMin(arr));
        System.out.println("Average value from the arrays is: " + findAvg.findAvg(arr));
        reverse.reverseArr(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}