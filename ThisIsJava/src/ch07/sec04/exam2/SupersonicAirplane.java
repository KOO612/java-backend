package ch07.sec04.exam2;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    private int flyMode = NORMAL;

    public void setFlyMode(int flyMode) {
        this.flyMode = flyMode;
    }

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행");
        } else {
            super.fly();
        }
    }
}
