package LoopingStatements;

public class PrintingPatternTriangleNumbers {
    public static void main(String[] args) {
        int rows = 5, columns = 5;
        for (int i = 1; i<=rows;i++)
        {
            for (int j= 1; j <=i; j++)
            {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
}
