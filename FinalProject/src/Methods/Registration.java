package Methods;

import Classes.Car;
import Classes.Person;
import Classes.Rental;
import Enums.CarStatus;

import java.util.ArrayList;
import java.util.Objects;

public class Registration {



    public static ArrayList<Person> Customers = new ArrayList<>();
    public static ArrayList<Car> Cars = new ArrayList<>();
    public static  ArrayList<Rental> Rentals = new ArrayList<>();

    //This method add a customer in the customers arraylist
    public static void addPerson(Person person){
        if (Customers.contains(person)){
            System.out.println("You are already registered with us");
        } else if (person.age <18) {
            System.out.println("You must be 18 or older to rent a car with us");
        } else if (person.name != person.driverLicense.name ) {
            System.out.println("Your first name does not match with the first name on the driver's license");
        }else if (person.lastName != person.driverLicense.lastName ) {
            System.out.println("Your last name does not match with the last name on the driver's license");
        }
        else {
            Customers.add(person);
            System.out.println("You have been added to our database");
        }
    }

    //This method add a car in the Cars arraylist
    public static void addCar(Car car){
        if(!Cars.contains(car)){
            Cars.add(car);
            System.out.println("The car has been added into our database");

        }else {
            System.out.println("This Car is already added into our database");
        }
    }

    //This method shows all customers and their driver information
    public static void showCustomers(){
        if (Customers.size() != 0){
            System.out.println(" ");
            System.out.println("--------- There are: " + Customers.size() +  " customers Registered--------");
            System.out.println(" ");
            for (Person customer : Customers) {
                System.out.println(" ");
                System.out.println("---------Customer's information-----------");
                System.out.println("Name: " + customer.name);
                System.out.println("Last name: " + customer.lastName);
                System.out.println("Age : " + customer.age);
                System.out.println("Address : " + customer.address);
                System.out.println("Email address : " + customer.email);
                System.out.println("Phone number: " + customer.phoneNumber);
                System.out.println(" ");
                System.out.println("---------" + customer.name + "'s" + " -- Driver's license information-----------");
                System.out.println("Name on driver's license: " + customer.driverLicense.name);
                System.out.println("Last Name on driver's license: " + customer.driverLicense.lastName);
                System.out.println("Eyes color on driver's license: " + customer.driverLicense.eyesColor);
                System.out.println("Hair color on driver's license: " + customer.driverLicense.hairColor);
                System.out.println("Gender on driver's license: " + customer.driverLicense.gender);
                System.out.println("License number on driver's license: " + customer.driverLicense.licenseNumber);
                System.out.println("Province issued on driver's license: " + customer.driverLicense.issuedProvince);
                System.out.println("Issued date on driver's license: " + customer.driverLicense.issuedDate);
                System.out.println("Expiration date on driver's license: " + customer.driverLicense.expirationDate);

            }
        }else {
            System.out.println("There are no customers added");
        }
    }

    //This method shows all the cars registered in the array Cars(Rented and Available)
    public static void showAllCars(){
        if (Cars.size() != 0){
            System.out.println("--------- There are: " + Cars.size() +  " cars Registered--------");
            for (Car car : Cars) {
                System.out.println("------------------------------");
                System.out.println("Car's color: " + car.getColor());
                System.out.println("Car's type: " + car.getCarType());
                System.out.println("Car's brand : " + car.getBrandName());
                System.out.println("Car's model : " + car.getModelName());
                System.out.println("Car's fuel type : " + car.getFuelType());
                System.out.println("Car's rental price : " + car.getDailyRentalPrice() + "$ CAD per day");
                System.out.println("Car's rental status : " + car.getRentalStatus());
                System.out.println("This car is available to be rented for : " + car.getDuration() + " Days");
            }
        }else {
            System.out.println("There are not cars registered yet");
        }
    }


    //This method calculates the number of cars rented
    public static int calculateNumberRentedCars() {
        int cars = 0;

        for (Car car : Cars) {
            if (car.getRentalStatus() == CarStatus.RENTED) {

              cars++;
            }


        }
        return cars;
    }

    //This method shows all cars that are rented
    public static void showRentedCars()
    {

        if(calculateNumberRentedCars() == 0){
            System.out.println(" There are not cars rented yet ");
        }
        else {
            System.out.println("---------List of Cars rented ("+ calculateNumberRentedCars() +") ---------");
            System.out.println(" ");
            for(Car car: Cars){
                if(car.getRentalStatus() == CarStatus.RENTED){


                    System.out.println("Car's color: " + car.getColor());
                    System.out.println("Car's type: " + car.getCarType());
                    System.out.println("Car's brand : " + car.getBrandName());
                    System.out.println("Car's model : " + car.getModelName());
                    System.out.println("Car's fuel type : " + car.getFuelType());
                    System.out.println("Car's rental price : " + car.getDailyRentalPrice() + "$ CAD per day");
                    System.out.println("Car's rental status : " + car.getRentalStatus());
                    System.out.println("This car is available to be rented for : " + car.getDuration() + " Days");
                    System.out.println(" ");
                }
            }
        }

    }

    //This method shows all cars that are available for rent
    public static void showAvailableCars(){

        if(calculateNumberAvailableCars() == 0){
            System.out.println(" There are not cars available to rent ");
        }else {
            System.out.println("---------List of Cars available ("+ calculateNumberAvailableCars() +") ---------");
            System.out.println(" ");
            for(Car car: Cars){

                if(car.getRentalStatus() == CarStatus.AVAILABLE){

                    System.out.println("Car's color: " + car.getColor());
                    System.out.println("Car's type: " + car.getCarType());
                    System.out.println("Car's brand : " + car.getBrandName());
                    System.out.println("Car's model : " + car.getModelName());
                    System.out.println("Car's fuel type : " + car.getFuelType());
                    System.out.println("Car's rental price : " + car.getDailyRentalPrice() + "$ CAD per day");
                    System.out.println("Car's rental status : " + car.getRentalStatus());
                    System.out.println("This car is available to be rented for : " + car.getDuration() + " Days");
                    System.out.println(" ");
                }
            }
        }

    }

    //This method calculates the number of cars available for rent
    public static int calculateNumberAvailableCars() {
        int cars = 0;

        for (Car car : Cars) {
            if (car.getRentalStatus() == CarStatus.AVAILABLE) {

                cars++;
            }


        }
        return cars;
    }
    public static void rentCar(Person person, Car car) {
        // Check if the car is already rented to another customer
        for (Rental rental : Rentals) {
            if (rental.car == car) {
                System.out.println("The car selected is already rented to another customer, please select another car");
                return;
            }
        }

        // Check if the person already has rented a car
        for (Rental rental : Rentals) {
            if (rental.person == person) {
                System.out.println("You already have rented a car with us. A user cannot rent 2 cars at the same time");
                return;
            }
        }

        // Rent the car if it's available
        car.setRentalStatus(CarStatus.RENTED);
        Rentals.add(new Rental(person, car));

        System.out.println(person.name + " rented a " + car.getBrandName() + " " + car.getModelName() +
                " for " + car.getDuration() + " days. The daily price is " + car.getDailyRentalPrice() +
                "$CAD. When the car is returned, we will earn " + (car.getDailyRentalPrice() * car.getDuration()) + "$CAD");
    }

    public static void calculateIncomes(){

        int days =0;
        int totalIncome = 0;


        for (Rental rental: Rentals){
            days += rental.car.getDuration();
            totalIncome += (int) rental.car.getDailyRentalPrice() * rental.car.getDuration();
        }
        System.out.println("In the last " +days +" The company has earned " + totalIncome+ "$CAD with an average of " + (totalIncome/days)+ "$CAD per day");
    }

}
