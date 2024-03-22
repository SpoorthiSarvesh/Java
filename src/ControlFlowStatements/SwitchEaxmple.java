package ControlFlowStatements;

public class SwitchEaxmple {
    public static void main(String[] args) {
        char ch='c';
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println("vowel");
                break;
            case 'c':
                System.out.println("consonent");
                break;
            default:
                System.out.println("alphabets");
        }
    }

}
