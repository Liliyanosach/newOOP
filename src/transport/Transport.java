package transport;

abstract class Transport <T extends Driver> implements Competable {
    private final String brand;
    private final String model;
    private double engineCapacity;
    private T driver;

    public Transport(String brand, String model,double engineCapacity,T driver) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.driver = driver;
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

    @Override
    public String toString() {
        return "Brand: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineCapacity +
                ", Водитель " + driver;
    }

    public abstract void startMoving();
    public abstract  void finishMoving();
    public void printInfo(){
        System.out.println("Водитель " + getDriver() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }

}
