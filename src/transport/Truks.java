package transport;

public class Truks extends Transport<DriverCategoryC> {

    LoadCapacity loadCapacity;

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

    public Truks(String brand, String model, double engineCapacity, DriverCategoryC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineCapacity, driver);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return  loadCapacity +
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
    public void getType() {

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
