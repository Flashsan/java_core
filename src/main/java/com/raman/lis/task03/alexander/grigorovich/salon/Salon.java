package com.raman.lis.task03.alexander.grigorovich.salon;


import com.raman.lis.task03.alexander.grigorovich.factory.CarFactory;
import com.raman.lis.task03.alexander.grigorovich.model.Car;
import com.raman.lis.task03.alexander.grigorovich.model.*;
import com.raman.lis.task03.alexander.grigorovich.service.*;

public class Salon {

    public PassengerCar createPassengerCarOnFactory(CarFactory carFactory, String color,
                                                    String model, int diameterOfWheels,
                                                    double volumeOfEngine) {

        return carFactory.createNewPassengerCar(color, model, diameterOfWheels, volumeOfEngine);

    }

    public SportCar createSportCarOnFactory(CarFactory carFactory, String color, String model,
                                            int diameterOfWheels, double volumeOfEngine,
                                            int numberOfSeats, int weightSportCar) {

        return carFactory.createNewSportCar(color, model, diameterOfWheels, volumeOfEngine,
                numberOfSeats, weightSportCar);
    }

    public TruckCar createTruckCarOnFactory(CarFactory carFactory, String color, String model, int diameterOfWheels,
                                            double volumeOfEngine, int liftingCapacity) {

        return carFactory.createNewTruckCar(color, model, diameterOfWheels,
                volumeOfEngine, liftingCapacity);
    }

    public Car getCarFromStorage(CarFactory carFactory, int number) {
        return carFactory.getCarFromStorage(number);

    }

    public void changeColor(PaintingService paintingService, Car car, String color) {
        paintingService.changeColor(car, color);
    }

    public void changeWheels(TireFittingService tireFittingService, Car car, int diameterWheels) {
        tireFittingService.tireFitting(car, diameterWheels);
    }

    public void addOptions(AdditionalEquipmentService additionalEquipmentService, Car car, String addOptions) {
        additionalEquipmentService.addAdditionalOptions(car, addOptions);
    }

    public void removeOptions(AdditionalEquipmentService additionalEquipmentService, Car car, String addOptions) {
        additionalEquipmentService.removeAdditionalOptions(car, addOptions);
    }

}
