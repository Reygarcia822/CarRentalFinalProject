package Classes;

public class Person {

    public String name;
    public String lastName;
    public DriverLicense driverLicense;

    public int age;

    public String address;

    public String email;

    public String phoneNumber;

    public Person(String name, String lastName, DriverLicense driverLicense, int age, String address, String email, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.driverLicense = driverLicense;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
