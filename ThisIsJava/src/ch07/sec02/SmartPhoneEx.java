package ch07.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("갤럭시", "은색");

        System.out.println(phone.model);
        System.out.println(phone.color);

        System.out.println(phone.wifi);

        phone.bell();
        phone.sendVoice("여보세요");
        phone.receiveVoice("안녕하세요");
        phone.hangUp();
        phone.setWifi(true);
        phone.internet();
    }
}
