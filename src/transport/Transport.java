package transport;

abstract class Transport {
    private final String brand;
    private final String model;
    private double engineCapacity;

    public Transport(String brand, String model,double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
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
        return  "Brand: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + engineCapacity;
    }

    public void startMoving(){

    }
    public void finishMoving(){

    }
}
