package Test_1;

public class PrintPattern {
    public static void main(String[] args) {
        int i,j,rows=5,columns=5;
        for(i=1;i<=rows;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.println("*  ");
            }
            System.out.println();
        }
    }
}
