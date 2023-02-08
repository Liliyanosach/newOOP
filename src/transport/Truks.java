package transport;

public class Truks extends Transport implements Competing{

    public Truks(String brand, String model,  double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Грузовой автомобиль начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Грузовой автомобиль остановился");
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
