package transport;

public class DriverCategoryB extends Driver{
    public DriverCategoryB(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving(){}
}
