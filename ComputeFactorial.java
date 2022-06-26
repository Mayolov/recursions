import java.util.Scanner;

public class ComputeFactorial {
    /** Main method */

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a nonnegative int: ");
            int n = input.nextInt();

            System.out.println("Factorial of " + n + " is " + factorial(n));
            System.out.println("fibonacci of " + n + " is " + fib(n));
        }

    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1); // recursive call
    }

    public static long fib(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2);
    }
}