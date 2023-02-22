package transport;

import java.util.List;
import java.util.Set;

public class Trucks extends Transport<DriverCategoryC> {

    private final LoadCapacity loadCapacity;

    enum LoadCapacity {
        N1(null,3.5F),
        N2(3.5F,12F),
        N3(12F,null);

        private final Float upperLoadLimits;
        private final Float lowerLoadLimits;

        LoadCapacity(Float lowerLoadLimits, Float upperLoadLimits) {
            this.lowerLoadLimits = lowerLoadLimits;
            this.upperLoadLimits = upperLoadLimits;
        }

        public Float getUpperLoadLimits() {
            return upperLoadLimits;
        }

        public Float getLowerLoadLimits() {
            return lowerLoadLimits;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: " +
                    (getLowerLoadLimits() == null ? "" : "от " + getLowerLoadLimits() + " тонн ") +
                    (getUpperLoadLimits() == null ? "" : "до " + getUpperLoadLimits() + " тонн.");
        }
    }

    public Trucks(String brand, String model, double engineCapacity, DriverCategoryC driver, Type type, LoadCapacity loadCapacity, Set<Mechanic> mechanics) {
        super(brand, model, engineCapacity, driver, type, mechanics);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return loadCapacity +
                " " + super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Грузовой автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Грузовой автомобиль марки " + getBrand() + "остановился");
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Пройти диагностику грузового автомобиля");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп грузового автомобиля "+ getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля "+ getBrand() + " " + getModel());
    }
}
