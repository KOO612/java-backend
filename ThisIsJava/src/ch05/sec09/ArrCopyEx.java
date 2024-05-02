package ch05.sec09;

public class ArrCopyEx {
    public static void main(String[] args) {
        String[] old = {"java", "js", "c"};
        String[] newArr = new String[5];

        System.arraycopy(old, 0, newArr, 0, old.length);

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
