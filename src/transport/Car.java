package transport;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;


    /* Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
     * Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
     * Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
     * Если год производства ≤0, то значение по умолчанию — 2000.
     */

    public Car(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxSpeed,
               double engineVolume,
               String transmission,
               String bodyType,
               int registrationNumber,
               int numberOfSeats,
               boolean summerTires,
               Key key) {
        super(brand, model, year, country, color, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = model;
        }
        setRegistrationNumber(registrationNumber);

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.summerTires = summerTires;
        setKey(key);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(int registrationNumber) {
        if (registrationNumber <= 0) {
            this.registrationNumber = 1;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if(key == null){
            key = new Key(false,false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume  +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats + '\'' +
                 (summerTires ? " летняя, " : " зимняя, ") +
                ", key=" + key +
                "} " + super.toString();
    }

    public void changeTiresToSeasonal(int month) {
        if (month >= 4 && month <= 10) {
            summerTires = true;
        } else {
            summerTires = false;
        }

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
            return (remoteEngineStarYes?" Удаленный запуск двигателя есть":" Удаленного запуска двигателя нет") +
                    (keylessEntryYes?" Бесключевой доступ есть ":" Бесключевого доступа нет");
        }
    }
}



