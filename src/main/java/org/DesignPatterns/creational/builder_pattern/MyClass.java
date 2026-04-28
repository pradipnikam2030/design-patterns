package org.DesignPatterns.creational.builder_pattern;

public class MyClass {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder();

        Car car = carBuilder.engine("Toyota")
                .color("Black")
                .sunRoof(true)
                .navigationSystem(true)
                .build();

        System.out.println(car);

        Car car1 = new Car.CarBuilder().engine("BMW").build();

        System.out.println(car1);
    }
}
