package oop;

public class CarTest {
    public static void main(String[] args) {
        /*
         * Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
         *Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
         *BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
         *Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
         *Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
         */
        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Granta";
        car1.engineVolume = 1.7;
        car1.color = "yellow";
        car1.year = 2015;
        car1.country = "Russia";
        System.out.println(car1);

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.engineVolume = 3.0;
        car2.color = "black";
        car2.year = 2020;
        car2.country = "Germany";
        System.out.println(car2);

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = 3.0;
        car3.color = "black";
        car3.year = 2021;
        car3.country = "Germany";
        System.out.println(car3);

        Car car4 = new Car();
        car4.brand = "KIA";
        car4.model = "Sportage";
        car4.engineVolume = 2.4;
        car4.color = "red";
        car4.year = 2018;
        car4.country = "Korea";
        System.out.println(car4);

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = 1.6;
        car5.color = "orange";
        car5.year = 2014;
        car5.country = "Korea";
        System.out.println(car5);

        Car car6 = new Car("Lada", "Granta",1.7,"yellow",2015, "Russia");
        Car car7 = new Car("Audi", "A8 50 L TDI quattro",3,"black",2020, "Germany");
        Car car8 = new Car("BMW", "Z8",3,"Black",2021, "Germany");
        Car car9 = new Car("Kia", "Sportage",2.4,"red",2018, "Korea");
        Car car10 = new Car("Hyundai", "Avante",1.7,"orange",2014, "Korea");
        System.out.println(car6);
        System.out.println(car7);
        System.out.println(car8);
        System.out.println(car9);
        System.out.println(car10);


    }
}
