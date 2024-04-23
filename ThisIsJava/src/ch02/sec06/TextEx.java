package ch02.sec06;

public class TextEx {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        // 텍스트 블록 문법 java 13부터 지원
        String str2 = """
                {
                "id":"winter",
                "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("-------------------");
        System.out.println(str2);
        System.out.println("-------------------");
        // 텍스트 블록 문법에서 줄 바꿈 없이 연속으로 작성하기 원하면 \ 사용 java14 부터 지원
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);
    }
}
