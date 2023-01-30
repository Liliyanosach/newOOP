package oop;

import javax.swing.*;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    /* Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
     * Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
     * Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
     * Если год производства ≤0, то значение по умолчанию — 2000.
     */
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }


        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
