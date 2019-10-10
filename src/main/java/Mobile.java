public abstract class Mobile {
    public abstract String call(String message);
    public abstract String getBasicInformation(String name, String color, String brand);


    public static void main(String[] args){
        Android android2 = new Android();
        iPhone apple2 = new iPhone();

        Mobile apple = new iPhone();
        Mobile android = new Android();
        Mobile mobile = new Mobile() {
            public String call(String message) {
                return "Message: " + message;
            }
            public String getBasicInformation(String name, String color, String brand) {
                return "name: " + name + ", color: " + color + ", brand: " + brand;
            }
        };

        System.out.println(mobile.call("I have all the phones"));
        System.out.println(apple.call("My phone is Apple and its OS is IOS"));
        System.out.println(android.call("My phone is LG and its OS is Android"));

        apple2.setName("IphoneX");
        apple2.setBrand("Apple");
        apple2.setColor("Red");

        android2.setName("Samsung Note 10");
        android2.setBrand("Samsung");
        android2.setColor("Black");


//        System.out.println(mobile.getBasicInformation("Generic","Blue","Generic"));
        System.out.println(apple.getBasicInformation(apple2.getName(),apple2.getColor(),apple2.getBrand()));
        System.out.println(android.getBasicInformation(android2.getName(),android2.getColor(),android2.getBrand()));
    }
}
