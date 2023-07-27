package Classes;

import Enums.Colors;
import Enums.Gender;
import Enums.Location;

public class DriverLicense {

    public String name;
    public String lastName;
    public Colors eyesColor;
    public Colors hairColor;
    public Gender gender;
    public int licenseNumber;
    public Location issuedProvince;
    public String issuedDate;
    public String expirationDate;



    public DriverLicense(String name, String lastName, Colors eyesColor, Colors hairColor, Gender gender, int licenseNumber, Location issuedProvince, String issuedDate, String expirationDate) {
        this.name = name;
        this.lastName = lastName;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
        this.gender = gender;
        this.licenseNumber = licenseNumber;
        this.issuedProvince = issuedProvince;
        this.issuedDate = issuedDate;
        this.expirationDate = expirationDate;
    }
}
