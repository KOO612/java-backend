package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("bmw");
        Car yourCar = new Car("벤츠");

        myCar.run();
        yourCar.run();
    }
}
