package transport;

public class Truks extends Transport<DriverCategoryC> {

    public Truks(String brand, String model, double engineCapacity, DriverCategoryC driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Грузовой автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Грузовой автомобиль марки " + getBrand() + "остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп грузового автомобиля "+ getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля "+ getBrand() + " " + getModel());
    }
}
