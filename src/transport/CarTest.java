package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CarTest {
    public static void main(String[] args) {

        List<Mechanic> mechanics = new ArrayList<>();
        Mechanic m1 = new Mechanic("Иванов Иван", "Транс");
        Mechanic m2 = new Mechanic("Петров Петр", "СТО");
        Mechanic m3 = new Mechanic("Семенов Семен", "Крот");
        Mechanic m4 = new Mechanic("Семенов Семен", "Крот");

        mechanics.add(m1);
        mechanics.add(m2);
        mechanics.add(m3);
        mechanics.add(m4);

        Car car1  = new Car("Kia", "RIO", 3.4, new DriverCategoryB("Иванов Иван Викторович", true, 5), Type.CAR, Car.BodyType.SEDAN,mechanics);
        Bus bus1 = new Bus("Reno", "Sts", 5.2, new DriverCategoryD("Петров Дмитрий Викторович", true, 6), Type.BUS, Bus.CapacityType.LARGE, mechanics);
        Trucks truck1 = new Trucks("Ford", "Bronkas", 3.8,new DriverCategoryC("Мошкин Виктор Сергеевич", true, 4),Type.TRUCK,Trucks.LoadCapacity.N2, mechanics);


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


        ServiceStation<Transport<?>> serviceStation = new ServiceStation<>();
        for(Transport<?> ts: participatingCar) {
            try {
                serviceStation.addToQueue(ts);
            } catch (TransportTypeException e) {
                System.out.println("Автобусы диагностику проходить не должны");
            }
        }
        System.out.println("Очередь на обслуживание: "+ serviceStation);

        for(int i = 0; i < participatingCar.size();i++)
            serviceStation.makeDiagnostic();

        Set<Driver> drivers = new HashSet<>();
        drivers.add(new DriverCategoryD("Мошкин Семен Иванович", true,4));
        drivers.add(new DriverCategoryD("Мошкин Семен Иванович", true,4));
        drivers.add(new DriverCategoryB("Сорока  Петр Иванович", true, 5));
        drivers.add(new DriverCategoryB("Сорока  Петр Иванович", true, 5));
        drivers.add(new DriverCategoryC("Петров Дмитрий Викторович",true,6));
        drivers.add(new DriverCategoryC("Петров Дмитрий Викторович",true,6));
        System.out.println(drivers);



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
