package ch05.sec05;

public class IndexEx {
    public static void main(String[] args) {
        String str = "자바 프로그래밍";

        int location = str.indexOf("프로그래밍");
        System.out.println(location);
        String sub = str.substring(location);
        System.out.println(sub);

        location = str.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책");
        } else {
            System.out.println("자바와 관련 없는 책");
        }

        boolean result = str.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책");
        } else {
            System.out.println("자바와 관련 없는 책");
        }
    }
}
