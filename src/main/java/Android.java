public class Android extends Mobile {
    private Integer messageLimit = 5;
    @Override
    public String call(String message){
        if(message.length() > messageLimit) {
            return "<Android> Message cannot be sent";
        }
        return "<Android>Message: " + message;
    }

    @Override
    public String getBasicInformation(String name, String color, String brand) {
            return "name: " + name + ", color: " + color + ", brand: " + brand;
    }
}
