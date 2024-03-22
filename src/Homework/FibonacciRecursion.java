package Homework;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10;
        int fibonacciN = fibonacci(n);
        System.out.println("The Fibonacci of " + n + " is " + fibonacciN);
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n-1 ) + fibonacci(n - 2);
    }
}