package transport;

import java.util.List;

public class Mechanic {

    private final String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void carryOutMaintenance(){
        System.out.println("Провести техобслуживание");
    }
    public void fixTheCar(){
        System.out.println("Починить машину");
    }

    @Override
    public String toString() {
        return "Фамилия, Имя: " + name +
                ", компания " + company;
    }
}
