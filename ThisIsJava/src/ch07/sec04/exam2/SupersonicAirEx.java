package ch07.sec04.exam2;

public class SupersonicAirEx {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.setFlyMode(2);
        sa.fly();
        sa.setFlyMode(1);
        sa.fly();
        sa.land();
    }
}
