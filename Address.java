import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
}

@Getter
@Setter
class Person {
    private String name;
    private Address address;

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("123 Elm Street");
        address.setCity("Springfield");
        address.setState("IL");
        address.setZipCode("62704");

        Person person = new Person();
        person.setName("John Doe");
        person.setAddress(address);

        System.out.println(person.getName() + " lives at " + 
                           person.getAddress().getStreet() + ", " + 
                           person.getAddress().getCity() + ", " + 
                           person.getAddress().getState() + " " + 
                           person.getAddress().getZipCode() + ".");
    }
}
