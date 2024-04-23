package ch02.sec03;

public class CharEx {
    public static void main(String[] args) {
        for (int i = 300; i < 700; i++) {
            char a = (char)i;
            System.out.println("숫자: " + i + ", 문자: " + a);

        }
        // 컴파일 오류 발생 공백 한칸 넣어주고 초기화
        // char c = '';
        char c = ' ';
    }
}
