package ch05.sec05;

public class ReplaceEx {
    public static void main(String[] args) {
        String oldStr = "자바 분자열 불변 자바 문자열 String";
        String newStr = oldStr.replace("자바", "java");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
