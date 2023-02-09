package transport;

public class DriverCategoryB extends Driver {


    public DriverCategoryB(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public String toString() {
        return super.toString() + ", водитель категории B";
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории В " + getFullName() + " остановился");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Водитель категории В " + getFullName() + " заправляет легковой автомобиль");
    }
}
