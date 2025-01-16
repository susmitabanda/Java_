public class LED {
    private int id;
    private String brand;
    private double price;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        LED sonyOLED = new LED();
        sonyOLED.setId(1);
        sonyOLED.setBrand("Sony");
        sonyOLED.setPrice(1500.0);

        LED samsungOLED = new LED();
        samsungOLED.setId(2);
        samsungOLED.setBrand("Samsung");
        samsungOLED.setPrice(2000.0);

        if (sonyOLED.getPrice() > samsungOLED.getPrice()) {
            sonyOLED.setBrand("Premium Model");
        } else if (samsungOLED.getPrice() > sonyOLED.getPrice()) {
            samsungOLED.setBrand("Premium Model");
        }

        System.out.println("ID: " + sonyOLED.getId() + ", Brand: " + sonyOLED.getBrand() + ", Price: " + sonyOLED.getPrice());
        System.out.println("ID: " + samsungOLED.getId() + ", Brand: " + samsungOLED.getBrand() + ", Price: " + samsungOLED.getPrice());
    }
}
