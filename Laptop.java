public class Laptop {
    private String brand;
    private double price;
    private String processorType;

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.setBrand("HP");
        hp.setPrice(700.0);
        hp.setProcessorType("Intel Core i5");

        Laptop lenovo = new Laptop();
        lenovo.setBrand("LENOVO");
        lenovo.setPrice(800.0);
        lenovo.setProcessorType("AMD Ryzen 5");

        Laptop dell = new Laptop();
        dell.setBrand("DELL");
        dell.setPrice(900.0);
        dell.setProcessorType("Intel Core Ultra");

        User user = new User();
        user.setUsername("John Doe");
        user.setAddress("123 Main Street");

        Laptop selectedLaptop = null;
        if (hp.getProcessorType().equals("Intel Core Ultra")) {
            selectedLaptop = hp;
        } else if (lenovo.getProcessorType().equals("Intel Core Ultra")) {
            selectedLaptop = lenovo;
        } else if (dell.getProcessorType().equals("Intel Core Ultra")) {
            selectedLaptop = dell;
        }

        if (selectedLaptop != null) {
            System.out.println(user.getUsername() + " from " + user.getAddress() + " purchased a " + 
                               selectedLaptop.getBrand() + " laptop with processor " + selectedLaptop.getProcessorType());
        } else {
            System.out.println(user.getUsername() + " from " + user.getAddress() + " did not find a suitable laptop.");
        }
    }
}

class User {
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public String getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
