package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.company);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.maxSpeed);
        System.out.println(car.speed);

        car.speed = 60;
        System.out.println("수정 속도 : " + car.speed);
    }
}
