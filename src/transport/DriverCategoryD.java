package transport;

public class DriverCategoryD extends Driver{

    public DriverCategoryD(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public String toString() {
        return super.toString() + ", водитель категории D";
    }
    @Override
    public void startMoving(){
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }
    @Override
    public void stop(){
        System.out.println("Водитель категории D " + getFullName() + " остановился");
    }
    @Override
    public void refuelTheCar(){
        System.out.println("Водитель категории D " + getFullName() + " заправляет автобус");
    }
}
