package org.DesignPatterns.builder_pattern;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", sunRoof=" + sunRoof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }

    private String engine;
    private int wheels;
    private String color;
    private int seats;
    private boolean sunRoof;
    private boolean navigationSystem;

    private Car (CarBuilder carBuilder){
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.color = carBuilder.color;
        this.seats = carBuilder.seats;
        this.sunRoof = carBuilder.sunRoof;
        this.navigationSystem = carBuilder.navigationSystem;

    }



    public static class  CarBuilder {
        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder sunRoof(boolean sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public CarBuilder navigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build(){
            return new Car(
                    this);
        }

        private String engine;
        private int wheels = 4;
        private String color = "black";
        private int seats = 4;
        private boolean sunRoof = false;
        private  boolean navigationSystem = false;


    }
}
