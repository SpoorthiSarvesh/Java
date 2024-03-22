package Homework;

public class PerformAdditionWithoutArthmeticOperator {
    public static void main(String[] args) {
        int a = 7, b = 14;
        int c = a & b;
        a = a ^ b;
        b = c << 1;
        System.out.println(c);
    }
}
