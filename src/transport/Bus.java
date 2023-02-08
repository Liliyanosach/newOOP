package transport;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Автобус начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Автобус остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость ");
    }
}
