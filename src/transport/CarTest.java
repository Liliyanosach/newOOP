package transport;

public class CarTest {
    public static void main(String[] args) {


        Transport<?>[] transports = {
                new Car("Lada", "Granta", 1.7,new DriverCategoryB("Иванов Иван Викторович", true, 5), Car.BodyType.SEDAN, Type.CAR),
                new Car("Audi", "A8", 3.0,  new DriverCategoryB("Иванов Иван Викторович", true, 5),Car.BodyType.HATCHBACK, Type.CAR),
                new Car("BMW", "Z8", 3, new DriverCategoryB("Иванов Иван Викторович", true, 5), Car.BodyType.PICKUP, Type.CAR),
                new Car("Kia", "Sportage", 2.4, new DriverCategoryB("Иванов Иван Викторович", true, 5),Car.BodyType.SUV, Type.CAR),
                new Bus("Mersedes", "B151", 5, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.ESPECIALLY_LARGE, Type.BUS),
                new Bus("Scania", "E360", 5.5, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.MEDIUM, Type.BUS),
                new Bus("Lias", "R10", 4.8, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.EXTRA_SMALL,Type.BUS),
                new Bus("Reno", "Sts", 5.2, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.LARGE, Type.BUS),
                new Trucks("Ford", "Bronkas", 3.8, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), Trucks.LoadCapacity.N1, Type.TRUCK),
                new Trucks("Dodge", "Ram", 4.5, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), Trucks.LoadCapacity.N2, Type.TRUCK),
                new Trucks("Ford", "Raptor", 5, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), Trucks.LoadCapacity.N3, Type.TRUCK),
                new Trucks("JMS", "North", 3.5,new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4),Trucks.LoadCapacity.N1,Type.TRUCK)};

        for (Transport<?> transport : transports) {
            System.out.println(transport);
        }

        System.out.println();

        Trucks truckTest = new Trucks("Ford", "Bronkas", 3.8, new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4), null, Type.TRUCK);
        truckTest.printType();
        Bus busTest = new Bus("Reno", "Sts", 5.2, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Bus.CapacityType.LARGE, Type.BUS);
        busTest.printType();
        Car carTest = new Car("Lada", "Granta", 1.7,new DriverCategoryB("Иванов Иван Викторович", true, 5), Car.BodyType.SEDAN, Type.CAR);
        carTest.printType();






    }

    public static void printInfo(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getFullName() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() +  " и будет участвовать в заезде");
    }


}
