package ch05.sec05;

public class SubEx {
    public static void main(String[] args) {
        String ssn = "970612-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
