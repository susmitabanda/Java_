import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class mobile {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}

@Getter
@Setter
class Person {
    private String name;
    private mobile address;
}

@Getter
@Setter
class Mobile {
    private String brand;
    private String operatingSystem;
}

@Getter
@Setter
class Shop {
    private String name;
    private Mobile mobile;

    public static void main(String[] args) {
        Mobile vivoMobile = new Mobile();
        vivoMobile.setBrand("VIVO");
        vivoMobile.setOperatingSystem("Android 15");

        Shop shop = new Shop();
        shop.setName("Mobile World");
        shop.setMobile(vivoMobile);

        Person customer = new Person();
        customer.setName("Alice");
        Address customerAddress = new Address();
        customerAddress.setStreet("456 Maple Avenue");
        customerAddress.setCity("Springfield");
        customerAddress.setState("IL");
        customerAddress.setZipCode("62705");
        customer.setAddress(customerAddress);

        if (shop.getMobile() != null && shop.getMobile().getBrand().equals("VIVO") 
                && shop.getMobile().getOperatingSystem().equals("Android 15")) {
            System.out.println(customer.getName() + " purchased a " + shop.getMobile().getBrand() + 
                               " mobile with " + shop.getMobile().getOperatingSystem() + " from " + shop.getName() + ".");
        } else {
            System.out.println(customer.getName() + " did not find a suitable mobile to purchase.");
        }
    }
}
