package transport;

public class Car extends Transport <DriverCategoryB> {


    public Car(String brand, String model, double engineCapacity, DriverCategoryB driver) {
        super(brand, model, engineCapacity, driver);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving(){
        System.out.println("Легковой автомобиль марки " + getBrand() + "начал движение");
    }

    @Override
    public void finishMoving(){
        System.out.println("Легковой автомобиль марки " + getBrand() + "остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит стоп автомобиля "+ getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: " + getBrand() + " " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля "+ getBrand() + " " + getModel());
    }


    public static class Key {
        private final boolean remoteEngineStarYes;
        private final boolean keylessEntryYes;

        public Key(boolean remoteEngineStarYes, boolean keylessEntryYes) {
            this.remoteEngineStarYes = remoteEngineStarYes;
            this.keylessEntryYes = keylessEntryYes;
        }

        public boolean isRemoteEngineStarYes() {
            return remoteEngineStarYes;
        }

        public boolean isKeylessEntryYes() {
            return keylessEntryYes;
        }

        @Override
        public String toString() {
            return (remoteEngineStarYes?" удаленный запуск двигателя есть, ":" удаленного запуска двигателя нет, ") +
                    (keylessEntryYes?" бесключевой доступ есть ":" бесключевого доступа нет");
        }
    }
}



