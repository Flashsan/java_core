package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.model.Car;
import com.raman.lis.task03.alexander.grigorovich.model.PassengerCar;
import com.raman.lis.task03.alexander.grigorovich.model.SportCar;
import com.raman.lis.task03.alexander.grigorovich.model.TruckCar;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFactory implements CarFactoryInterface, PassengerCarFactoryInterface,
        SportCarFactoryInterface, TruckCarFactoryInterface {

    private PassengerCar passengerCar;
    private SportCar sportCar;
    private TruckCar truckCar;

    List<Car> cars = new ArrayList<>();

    public CarFactory(PassengerCar passengerCar, SportCar sportCar, TruckCar truckCar) {
    }

    @Override
    public void addressFactory() {
        System.out.println("Unknown");
    }

    public abstract void listCarOnStorage();

    public abstract Car getCarFromStorage(int numberCatOnStorage);

    public abstract void listOfModelCar();

    public abstract void listOfInstalledMotors();

    public abstract void listOfInstalledWheels();

    public abstract void listOfInstalledColor();

    public abstract void listOfInstalledAdditionalOptions();


}
