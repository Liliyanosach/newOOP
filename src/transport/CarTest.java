package transport;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car1  = new Car("Kia", "RIO", 3.4, new DriverCategoryB("Иванов Иван Викторович", true, 5), Type.CAR, Car.BodyType.SEDAN);
        Bus bus1 = new Bus("Reno", "Sts", 5.2, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Type.BUS, Bus.CapacityType.LARGE);
        Trucks truck1 = new Trucks("Ford", "Bronkas", 3.8,new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4),Type.TRUCK,Trucks.LoadCapacity.N2);

        Mechanic m1 = new Mechanic("Иванов Иван", "Транс");
        Mechanic m2 = new Mechanic("Петров Петр", "СТО");
        Mechanic m3 = new Mechanic("Семенов Семен", "Крот");
        car1.mechanics.add(m1);
        car1.mechanics.add(m3);
        bus1.mechanics.add(m1);
        truck1.mechanics.add(m2);


        List<Transport<?>> participatingCar = new ArrayList<>();
        participatingCar.add(truck1);
        participatingCar.add(bus1);
        participatingCar.add(car1);

        System.out.println(car1);
        System.out.println(bus1);
        System.out.println(truck1);

        m1.fixTheCar();
        m2.carryOutMaintenance();

        car1.transportHaveMechanic();
        bus1.transportHaveMechanic();
        truck1.transportHaveMechanic();


        car1.nameDriverTransport();
        bus1.nameDriverTransport();
        truck1.nameDriverTransport();


        ServiceStation serviceStation = new ServiceStation<>();
        for(Transport ts: participatingCar) {
            try {
                serviceStation.addToQueue(ts);
            } catch (TransportTypeException e) {
                System.out.println("Автобусы диагностику проходить не должны");
            }
        }
        System.out.println("Очередь на обслуживание: "+ serviceStation);

        for(int i = 0; i < participatingCar.size();i++)
            serviceStation.makeDiagnostic();


    }

    public static void checkExceptionPassDiagnostics(Transport<?> transport){
        try {
            transport.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("Автобусы диагностику проходить не должны");
        }
    }

    public static void printInfo(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getFullName() + " управляет автомобилем "
                + transport.getBrand() + " " + transport.getModel() +  " и будет участвовать в заезде");
    }

}
