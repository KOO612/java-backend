package ch05.sec08;

public class ArrRef {
    public static void main(String[] args) {
        String[] strArr = new String[3];
        strArr[0] = "java";
        strArr[1] = "java";
        strArr[2] = "c";

        System.out.println(strArr[0] == strArr[1]);

        System.out.println(System.in);


        strArr[1] = "c++";
        System.out.println(strArr[0]);
        System.out.println(strArr[0] == strArr[1]);
    }
}
