public abstract class Mobile {

    public abstract String call(String message);
    public abstract String getBasicInformation(String name, String color, String brand);
    private String name;
    private String color;
    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
