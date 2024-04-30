package ch05.sec05;

public class Str {
    public static void main(String[] args) {
        String nm1 = new String("lee");
        String nm2 = new String("lee");
        System.out.println(nm1 == nm2);
        System.out.println(nm1.equals(nm2));
        String nm3 = "lee";
        String nm4 = "lee";
        String nm5 = nm1;
        System.out.println(nm3 == nm4);
        System.out.println(nm3 == nm1);
        System.out.println(nm5 == nm1);
    }
}
