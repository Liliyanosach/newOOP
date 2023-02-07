package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = setColor(color);
        this.maxSpeed = setMaxSpeed(maxSpeed);
    }

    /*
     * Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска», «Страна производства» не могут изменяться.
     * Параметры «Цвет» и «Скорость» изменяться могут.
     * Для изменяемых параметров добавьте проверку данных: значение должно быть указано корректно, не должно содержать null
     * и не может быть пустым.
     */

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        if (color == null || color.isEmpty()) {
            System.out.println("Неккоректный ввод");
        } else {
            this.color = color;
        }
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0 ) {
            maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
        return maxSpeed;
    }

    @Override
    public String toString() {
        return  "Brand: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", страна: " + country +
                ", цвет машины: " + color +
                ", максимальная скорость: " + maxSpeed;
    }
}
