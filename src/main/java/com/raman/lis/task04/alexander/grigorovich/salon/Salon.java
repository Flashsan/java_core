package com.raman.lis.task04.alexander.grigorovich.salon;

import com.raman.lis.task04.alexander.grigorovich.factory.AudiCarFactory;
import com.raman.lis.task04.alexander.grigorovich.factory.LamborghiniCarFactory;
import com.raman.lis.task04.alexander.grigorovich.factory.VolvoCarFactory;
import com.raman.lis.task04.alexander.grigorovich.model.Car;
import com.raman.lis.task04.alexander.grigorovich.model.PassengerCar;
import com.raman.lis.task04.alexander.grigorovich.model.SportCar;
import com.raman.lis.task04.alexander.grigorovich.model.TruckCar;
import com.raman.lis.task04.alexander.grigorovich.service.AdditionalOptionsService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeColorService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeWheelsService;
import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public class Salon {

    public PassengerCar createNewAudiPassengerCar(AudiCarFactory audiCarFactory, String color,
                                              String model, int diameterOfWheels,
                                              double volumeOfEngine) {
        return audiCarFactory.createNewPassengerCar(color, model, diameterOfWheels, volumeOfEngine);
    }


    public SportCar createNewAudiSportCar(AudiCarFactory audiCarFactory, String color, String model,
                                      int diameterOfWheels, double volumeOfEngine, int numberOfSeats,
                                      int weightSportCar) {

        return audiCarFactory.createNewSportCar(color, model, diameterOfWheels, volumeOfEngine,
                numberOfSeats, weightSportCar);
    }

    public SportCar createNewLamborghiniSportCar(LamborghiniCarFactory lamborghiniCarFactory,
                                                 String color, String model,
                                                 int diameterOfWheels, double volumeOfEngine, int numberOfSeats,
                                                 int weightSportCar) {

        return lamborghiniCarFactory.createNewSportCar(color, model, diameterOfWheels, volumeOfEngine,
                numberOfSeats, weightSportCar);
    }

    public PassengerCar createNewVolvoPassengerCar(VolvoCarFactory volvoCarFactory, String color,
                                                   String model, int diameterOfWheels,
                                                   double volumeOfEngine) {
        return volvoCarFactory.createNewPassengerCar(color, model, diameterOfWheels, volumeOfEngine);
    }

    public TruckCar createNewVolvoTruckCar(VolvoCarFactory volvoCarFactory, String color,
                                           String model, int diameterOfWheels, double volumeOfEngine,
                                           int liftingCapacity) {
        return volvoCarFactory.createNewTruckCar(color, model, diameterOfWheels,
                volumeOfEngine, liftingCapacity);
    }



    public void changeColor(ChangeColorService changeColorService, AbstractCar car, String color) throws CarException {
        changeColorService.changeColor(car, color);
    }

    public void changeWheels(ChangeWheelsService changeWheelsService, Car car, int diameterWheels) {
        changeWheelsService.changeWheels(car, diameterWheels);
    }

    public void addOptions(AdditionalOptionsService additionalOptionsService, Car car, String addOptions) {
        additionalOptionsService.addAdditionalOptions(car, addOptions);
    }

    public void removeOptions(AdditionalOptionsService additionalOptionsService, Car car, String removeOptions) {
        additionalOptionsService.removeAdditionalOptions(car, removeOptions);
    }
}
