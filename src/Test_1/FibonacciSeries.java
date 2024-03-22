package Test_1;

public class FibonacciSeries {
    static void fibonacci(int n) {
        int Number1 = 0, Number2 = 1, Number3;
        for (int i = 1; i <= n; i++) {
            System.out.println(Number1 + "   ");
            Number3 = Number1 + Number2;
            Number1 = Number2;
            Number2 = Number3;

    }
}
 public static void main(String[] args)
        {
            int n=10;
            fibonacci(n);
        }
    }

