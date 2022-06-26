public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {

        System.out.println(factorial(4));
    }

    // return the factorial for a specified number
    public static long factorial(int n) {
        // call auxiliary method
        return factorial(n, 1);
    }

    private static long factorial(int n, int result) {
        // auxiliary tail-recursive method for factorial
        if (n == 0) {
            return result;
        } else {
            // recursive call
            return factorial(n - 1, n * result);
        }
    }
}
