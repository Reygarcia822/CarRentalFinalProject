package Classes;

import Enums.*;
import Methods.Registration;

public class Car {

    private Colors color;

    private CarType carType;
    private CarBrands brandName;
    private CarModels modelName;
    private FuelType fuelType;
    private int dailyRentalPrice;
    private CarStatus rentalStatus;

    private int duration;

    public Car(Colors color, CarType carType, CarBrands brandName, CarModels modelName, FuelType fuelType, int dailyRentalPrice, CarStatus rentalStatus, int duration) {
        this.color = color;
        this.carType = carType;
        this.brandName = brandName;
        this.modelName = modelName;
        this.fuelType = fuelType;
        this.dailyRentalPrice = dailyRentalPrice;
        this.rentalStatus = rentalStatus;
        this.duration = duration;

    }

    public Colors getColor() {
        return color;
    }

    public CarType getCarType() {
        return carType;
    }

    public CarBrands getBrandName() {
        return brandName;
    }

    public CarModels getModelName() {
        return modelName;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public double getDailyRentalPrice() {
        return dailyRentalPrice;
    }

    public CarStatus getRentalStatus() {
        return rentalStatus;
    }

    public int getDuration() {return duration;}

    public void setRentalStatus(CarStatus rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
}
