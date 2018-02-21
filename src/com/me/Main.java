package com.me;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1978, "Chevy");
        System.out.println(car1.getYear());
        System.out.println(car1.getManufacturer());
        System.out.println();

        Car car2 = new Car(1968, "Ford", "Mustang");
        System.out.println(car2.getYear());
        System.out.println(car2.getManufacturer());
        System.out.println(car2.getModel());
        System.out.println();

        Car car3 = new Car(2009, "Dodge", "Charger", "red");
        System.out.println(car3.getYear());
        System.out.println(car3.getManufacturer());
        System.out.println(car3.getModel());
        System.out.println(car3.getColor());

    }

}
