package transport;

public class Bus extends Transport<DriverCategoryD> {

    private final CapacityType capacityType;

    enum CapacityType{
        EXTRA_SMALL (null,10),
        SMALL (null,25),
        MEDIUM (25,50),
        LARGE (50,80),
        ESPECIALLY_LARGE(80,120);

        private final Integer lowerLimitsOfCapacity;
        private final Integer upperLimitsOfCapacity;

        CapacityType(Integer lowerLimitsOfCapacity, Integer upperLimitsOfCapacity){
            this.lowerLimitsOfCapacity = lowerLimitsOfCapacity;
            this.upperLimitsOfCapacity = upperLimitsOfCapacity;
        }

        public Integer getLowerLimitsOfCapacity() {
            return lowerLimitsOfCapacity;
        }

        public Integer getUpperLimitsOfCapacity() {
            return upperLimitsOfCapacity;
        }

        @Override
        public String toString() {
            return "Вместимость: " +
                    (getLowerLimitsOfCapacity() == null ? "" : "от " + getLowerLimitsOfCapacity() + "") +
                    (getUpperLimitsOfCapacity() == null ? "" : " до " + getUpperLimitsOfCapacity() + "");
        }
    }

    public Bus(String brand, String model, double engineCapacity, DriverCategoryD driver, CapacityType capacityType, Type type) {
        super(brand, model, engineCapacity, driver, type);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    @Override
    public String toString() {
        return capacityType +
                " " + super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Автобус марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Автобус марки " + getBrand() + "остановился");
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
            if (capacityType != null) {
                System.out.println("Автобус: " + capacityType);
            } else {
                System.out.println("Данных по транспортному средству недостаточно");
            }
    }

    @Override
    public void passDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }


    @Override
    public void pitStop() {
        System.out.println("Пит стоп автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel());
    }
}
