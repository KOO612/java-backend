package ch05.sec05;

public class LengthEx {
    public static void main(String[] args) {
        String ssn = "9706121234567";
        int len = ssn.length();
        if (len == 13){
            System.out.println("올바른");
        } else {
            System.out.println("올바르지 않은");
        }
    }
}
