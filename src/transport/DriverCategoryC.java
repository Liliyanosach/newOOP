package transport;

public class DriverCategoryC extends Driver{


    public DriverCategoryC(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }
    @Override
    public String toString() {
        return super.toString() + ", водитель категории C";
    }
    @Override
    public void startMoving(){
        System.out.println("Водитель категории С " + getFullName() + " начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Водитель категории С " + getFullName() + " остановился");
    }
    @Override
    public void refuelTheCar(){
        System.out.println("Водитель категории С " + getFullName() + "заправляет грузовой автомобиль");
    }
}
