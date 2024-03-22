package LoopingStatements;

public class PatterPrintingTriangleNumbers2 {
    public static void main(String[] args)  {
        int rows = 5, columns = 5;
       // for (int i = 1; i<=rows;i++)
           for (int i = 5; i>=1;i--)
        {
           //for (int j= 1; j <=i; j++)
                for (int j = 1; j<=i;j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}