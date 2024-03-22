package LoopingStatements;

public class ForLoop {
    public static void main(String[] args) {
        int i=3;
        for(i=1;i<=10;i++)
        {
            if(i%3==0)
                continue;
            System.out.println(i);
        }
    }
}
