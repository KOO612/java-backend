package ch06.sec07;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // this 는 다른 생성자를 호출하는 역할

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
