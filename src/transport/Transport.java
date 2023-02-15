package transport;

abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;
    private final Type type;

    public Transport(String brand, String model,double engineCapacity,T driver, Type type) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
        this.type = type;
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
    public abstract void passDiagnostics() throws TransportTypeException;

    @Override
    public String toString() {
        return "Тип транспорта: "+ getType() + " Brand: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineCapacity +
                ", Водитель " + driver;
    }

}
