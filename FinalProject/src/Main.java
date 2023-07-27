import Classes.Car;
import Classes.DriverLicense;
import Classes.Person;
import Enums.*;
import Methods.Registration;

import java.awt.image.renderable.RenderableImage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car hondaAccord = new Car(Colors.RED, CarType.SEDAN, CarBrands.HONDA, CarModels.ACCORD, FuelType.GAS,35,CarStatus.AVAILABLE, 7);
        Car hondaCivic = new Car(Colors.BLACK, CarType.LUXURY, CarBrands.HONDA, CarModels.CIVIC, FuelType.HYBRID,75,CarStatus.AVAILABLE,10);



        Registration.addCar(hondaAccord);
        Registration.addCar(hondaCivic);







        DriverLicense reylincense = new DriverLicense("Rey","Garcia", Colors.BLUE,Colors.BLACK, Gender.MALE,123456, Location.BRITISH_COLUMBIA,"12-12-2022","12-12-2-28");
        Person rey = new Person("Rey","Garcia",reylincense,23,"1234 Laurel Street","rgarcia@gmail.com","778-321-9428");

        DriverLicense igorlincense = new DriverLicense("Igor","Maheler", Colors.BLACK,Colors.WHITE, Gender.MALE,1234433, Location.BRITISH_COLUMBIA,"12-12-2022","12-12-2-30");
        Person igor = new Person("Igor","Maheler",igorlincense,27,"1234 Cahedra Street","Igor@gmail.com","778-344-9180");

        Registration.addPerson(rey);
        Registration.addPerson(igor);

        Registration.rentCar(rey,hondaAccord);
        Registration.rentCar(igor,hondaCivic);

        Registration.showRentedCars();

        Registration.calculateIncomes();



    }
}