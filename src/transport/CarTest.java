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
        Car car1 = new Car("Lada","Granta", 1.7);
        Car car2 = new Car("Audi", "A8", 3.0);
        Car car3 = new Car("BMW", "Z8", 3);
        Car car4 = new Car("Kia", "Sportage", 2.4);

        Bus bus1 = new Bus("Mersedes","B151", 5);
        Bus bus2 = new Bus("Scania", "E360", 5.5);
        Bus bus3 = new Bus("Lias", "R10", 4.8);
        Bus bus4 = new Bus("Reno", "Sts", 5.2);

        Truks truks1 = new Truks("Ford", "Bronkas", 3.8);
        Truks truks2 = new Truks("Dodge", "Ram", 4.5);
        Truks truks3 = new Truks("Ford", "Raptor", 5);
        Truks truks4 = new Truks("JMS", "North", 3.5);





    }
}
