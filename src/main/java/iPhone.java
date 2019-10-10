public class iPhone extends Mobile {
    private Integer messageLimit = 5;
    @Override
    public String call(String message){
        if(message.length() > messageLimit) {
            return "<iPhone> Message cannot be sent";
        }
        return "<iPhone>Message: " + message;
    }

    @Override
    public String getBasicInformation(String name, String color, String brand) {
            return "name: " + name + ", color: " + color + ", brand: " + brand;
    }
}
