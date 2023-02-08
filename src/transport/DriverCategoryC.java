package transport;

public class DriverCategoryC extends Driver{
    public DriverCategoryC(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving(){
        System.out.println("Завести грузовой автомобиль");
    }
    @Override
    public void stop(){
        System.out.println("Остановить грузовой автомобиль");
    }
    @Override
    public void refuelTheCar(){
        System.out.println("Заправить грузовой автомобиль");
    }
}
