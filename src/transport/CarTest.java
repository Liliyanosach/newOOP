package transport;

public class CarTest {
    public static void main(String[] args) {
        /*
         * Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
         *Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
         *BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
         *Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
         *Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
         */


        Car car6 = new Car("Lada",
                "Granta",
                1.7,
                "yellow",
                2015,
                "Russia",
                "МКПП",
                "седан",
                54,
                4,
                true,
                new Car.Key(true,false));
//        Car car7 = new Car("Audi", "A8 50 L TDI quattro",3,"black",2020, "Germany");
//        Car car8 = new Car("BMW", "Z8",3,"Black",2021, "Germany");
//        Car car9 = new Car("Kia", "Sportage",2.4,"red",2018, "Korea");
//        Car car10 = new Car("Hyundai", "Avante",1.7,"orange",2014, "Korea");
        System.out.println(car6);

//        System.out.println(car7);
//        System.out.println(car8);
//        System.out.println(car9);
//        System.out.println(car10);


    }
}
