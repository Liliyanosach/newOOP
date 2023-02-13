package transport;

public class CarTest {
    public static void main(String[] args) {


        Transport<?>[] transports = {
                new Car("Lada", "Granta", 1.7,new DriverCategoryB("Иванов Иван Викторович", true, 5), Car.BodyType.SEDAN),
                new Car("Audi", "A8", 3.0,  new DriverCategoryB("Иванов Иван Викторович", true, 5),Car.BodyType.HATCHBACK),
                new Car("BMW", "Z8", 3, new DriverCategoryB("Иванов Иван Викторович", true, 5), Car.BodyType.PICKUP),
                new Car("Kia", "Sportage", 2.4, new DriverCategoryB("Иванов Иван Викторович", true, 5),Car.BodyType.SUV),
                new Bus("Mersedes", "B151", 5, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.ESPECIALLY_LARGE),
                new Bus("Scania", "E360", 5.5, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.MEDIUM),
                new Bus("Lias", "R10", 4.8, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.EXTRA_SMALL),
                new Bus("Reno", "Sts", 5.2, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.LARGE),
                new Truks("Ford", "Bronkas", 3.8, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), Truks.LoadCapacity.N1),
                new Truks("Dodge", "Ram", 4.5, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), Truks.LoadCapacity.N2),
                new Truks("Ford", "Raptor", 5, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), Truks.LoadCapacity.N3),
                new Truks("JMS", "North", 3.5,new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4),Truks.LoadCapacity.N1)};

        for (Transport<?> transport : transports) {
            System.out.println(transport);
        }



    }

    public static void printInfo(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getFullName() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() +  " и будет участвовать в заезде");
    }


}
