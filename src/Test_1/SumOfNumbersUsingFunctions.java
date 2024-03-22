package Test_1;

public class SumOfNumbersUsingFunctions
{
         static int naturalNumbersSum(int n)
         {
            int i;
            int sum = 0;
            for (i = 1; i <= n; i++)
                sum = sum + i;
                return sum;
        }

            public static void main (String[] args)
            {
                int n = 5;
                System.out.println("sum of natural numbers of " +n+" =  " + naturalNumbersSum(n));
            }

        }


