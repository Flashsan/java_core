package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.ENUM.Lamborghini.*;
import com.raman.lis.task03.alexander.grigorovich.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamborghiniFactory extends CarFactory {

    private int YEAR_OF_PRODUCTION = 2021;
    private String BRAND = "Lamborghini";

    List<Car> lamborghiniStorage = new ArrayList<>();

    public LamborghiniFactory(PassengerCar passengerCar, SportCar sportCar,
                              TruckCar truckCar) {
        super(passengerCar, sportCar, truckCar);

        lamborghiniStorage.add(new SportCar(BRAND,
                LamborghiniColor.RED.getLamborghiniColor(),
                LamborghiniModel.LAMBORGHINI_GALLARDO.getLamborghiniModel(),
                YEAR_OF_PRODUCTION,
                LamborghiniDiameterWheel.TWENTY_FIRST.getLamborghiniDiameter(),
                LamborghiniVolumeEngine.FIVE_AND_ZERO.getLamborghiniVolumeEngine(),
                2, 1500));
    }

    LamborghiniModel[] lamborghiniModels = LamborghiniModel.values();
    LamborghiniColor[] lamborghiniColors = LamborghiniColor.values();
    LamborghiniDiameterWheel[] lamborghiniDiameterWheels = LamborghiniDiameterWheel.values();
    LamborghiniVolumeEngine[] lamborghiniVolumeEngines = LamborghiniVolumeEngine.values();
    LamborghiniAdditionalOptions[] lamborghiniAdditionalOptions = LamborghiniAdditionalOptions.values();

    @Override
    public void listOfModelCar() {
        System.out.println("List of Lamborghini model : "
                + Arrays.toString(lamborghiniModels));
    }

    @Override
    public void listOfInstalledMotors() {
        System.out.println("List of installed motors on Lamborghini : "
                + Arrays.toString(lamborghiniVolumeEngines));
    }

    @Override
    public void listOfInstalledWheels() {
        System.out.println("List of installed wheels on Lamborghini : "
                + Arrays.toString(lamborghiniDiameterWheels));
    }

    @Override
    public void listOfInstalledColor() {
        System.out.println("List of color Lamborghini : "
                + Arrays.toString(lamborghiniColors));
    }

    @Override
    public void listOfInstalledAdditionalOptions() {
        System.out.println("List of installed additional options on Lamborghini : "
                + Arrays.toString(lamborghiniAdditionalOptions));
    }

    @Override
    public void listCarOnStorage() {
        if (lamborghiniStorage.size() < 0) {
            System.out.println("Storage is empty!");
        } else {
            Object[] lamborghiniStorageArray = lamborghiniStorage.toArray();

            for (Object lamborghiniStorage : lamborghiniStorageArray) {
                System.out.println(lamborghiniStorage);
            }
        }
    }

    @Override
    public Car getCarFromStorage(int numberCatOnStorage) {
        if (numberCatOnStorage > -1 && numberCatOnStorage < lamborghiniStorage.size()) {
            Car car = lamborghiniStorage.get(numberCatOnStorage - 1);
            return car;
        } else {
            System.out.println("Don't have car on storage!");
            return null;
        }
    }

    @Override
    public void addressFactory() {
        System.out.println("Sant'Agata Bolognese, Italy");
    }

    @Override
    public PassengerCar createNewPassengerCar(String color, String model,
                                              int diameterOfWheels, double volumeOfEngine) {

        System.out.println(BRAND + "does not produce cars of this type");
        return null;
    }

    @Override
    public SportCar createNewSportCar(String color, String model,
                                      int diameterOfWheels, double volumeOfEngine,
                                      int numberOfSeats, int weightSportCar) {

        SportCar sportCar = new SportCar(BRAND, color, model,
                YEAR_OF_PRODUCTION, diameterOfWheels, volumeOfEngine, numberOfSeats, weightSportCar);
        return sportCar;
    }

    @Override
    public TruckCar createNewTruckCar(String color, String model,
                                      int diameterOfWheels, double volumeOfEngine,
                                      int liftingCapacity) {

        System.out.println(BRAND + "does not produce cars of this type");
        return null;
    }


}
