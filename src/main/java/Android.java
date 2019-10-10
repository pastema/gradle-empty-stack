public class Android extends Mobile {
    private String name;
    private String color;
    private String brand;
    @Override
    public String call(String message){
        return "<Android>Message: " + message;
    }

    @Override
    public String getBasicInformation(String name, String color, String brand) {
        return "name: " + name + ", color: " + color + ", brand: " + brand;
    }


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
