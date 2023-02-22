package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;
    private final Type type;
    Set<Mechanic> mechanics = new HashSet<>();

    public Transport(String brand, String model, double engineCapacity, T driver, Type type, Set<Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
        this.type = type;
        this.mechanics = mechanics;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Set<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public abstract void startMoving();

    public abstract  void finishMoving();
    public void printInfo(){
        System.out.println("Водитель " + getDriver() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    public abstract Type getType();
    public abstract void printType();
    public abstract boolean passDiagnostics() throws TransportTypeException;

    public void transportHaveMechanic(){
        System.out.println(getType() + " " + getMechanics());
    }

    public void nameDriverTransport(){
        System.out.println(getType() + " " + driver.getFullName());
    }

    @Override
    public String toString() {
        return "Тип транспорта: "+ getType() + " Brand: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineCapacity +
                ", Водитель " + driver +
                ". Механик " + mechanics;
    }
}
