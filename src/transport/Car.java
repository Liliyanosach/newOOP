package transport;

public class Car extends Transport <DriverCategoryB> {

    private final BodyType bodyType;

    enum BodyType{
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        UNIVERSAL("Universal"),
        SUV("SUV"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van"),
        MINIVAN("Minivan");

        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType(){
            return bodyType;
        }

    }

    public Car(String brand, String model, double engineCapacity, DriverCategoryB driver,BodyType bodyType, Type type) {
        super(brand, model, engineCapacity, driver, type);
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType + " " + super.toString();
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
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public void printType() {
        System.out.println("Тип автомобиля " + (this.bodyType != null ? this.bodyType.toString() : " Данных по транспортному средству недостаточно"));
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Пройти диагностику легкового автомобиля");
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



