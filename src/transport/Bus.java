package transport;

public class Bus extends Transport<DriverCategoryD> {

    public Bus(String brand, String model, double engineCapacity, DriverCategoryD driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Автобус марки " + getBrand() + "остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel());
    }
}
