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


        Car car = new Car("Lada",
                "Granta",
                2020,
                "Russia",
                "red",
                150,
                1.6,
                "МКПП",
                "",
                25,
                4,
                true,
                new Car.Key(true,true)
                );
        System.out.println(car);

        Bus bus = new Bus("УАЗ","Газель",2020,"Russia","red", 120);
        System.out.println(bus);

        Transport bus2 = new Bus("mersedes", "Benz", 2021,"Germany", "black", 160);
        System.out.println(bus2);



    }
}
