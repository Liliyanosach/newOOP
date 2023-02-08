package transport;

public class DriverCategoryB extends Driver{
    public DriverCategoryB(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving(){
        System.out.println("Завести легковой автомобиль");
    }
    @Override
    public void stop(){
        System.out.println("Остановить легковой автомобиль");
    }
    @Override
    public void refuelTheCar(){
        System.out.println("Заправить легковой автомобиль");
    }
}
