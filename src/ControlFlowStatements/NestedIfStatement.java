package ControlFlowStatements;

import java.sql.SQLOutput;

public class NestedIfStatement {
    public static void main(String[] args) {
        int a=16;
        if(a%2==0) {
            if (a % 3 == 0) {
                if (a % 5 == 0) {
                    System.out.println(a + " mutilple of 30");
                }
            }
        }

        else
            System.out.println(a + " not a multiple of 30");
    }
}
