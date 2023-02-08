package transport;

public class DriverCategoryD extends Driver{
    public DriverCategoryD(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }
    @Override
    public void startMoving(){
        System.out.println("Завести автобус");
    }
    @Override
    public void stop(){
        System.out.println("Остановить автобус");
    }
    @Override
    public void refuelTheCar(){
        System.out.println("Заправить автобус");
    }
}
