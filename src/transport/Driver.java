package transport;

public abstract class Driver {
    private String fullName;
    private boolean driverLicense;
    private  int experience;

    public Driver(String fullName, boolean driverLicense, int experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель: " +
                " Ф.И.О " + fullName  +
                (driverLicense? ", водительсие права есть, " : ", водительских прав нет, ")
                + ", стаж " + experience;
    }

    public void startMoving(){
    }




}
