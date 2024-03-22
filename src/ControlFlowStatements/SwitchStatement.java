package ControlFlowStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int day=1;
        switch (day)
        {
            case 1:
                System.out.println("a");
                break;
            case 2:
                System.out.println("b");
                break;
            case 3:
                System.out.println("c");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
