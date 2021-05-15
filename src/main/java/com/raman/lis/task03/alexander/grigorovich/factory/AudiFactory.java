package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.ENUM.Audi.*;
import com.raman.lis.task03.alexander.grigorovich.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudiFactory extends CarFactory {

    private int YEAR_OF_PRODUCTION = 2021;
    private String BRAND = "AUDI";

    List<Car> audiStorage = new ArrayList<>();

    public AudiFactory(PassengerCar passengerCar, SportCar sportCar,
                       TruckCar truckCar) {
        super(passengerCar, sportCar, truckCar);

        audiStorage.add(new PassengerCar(BRAND,
                AudiColor.BLACK_GOLD.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                YEAR_OF_PRODUCTION,
                AudiDiameterWheel.SEVENTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.ONE_AND_NINE.getAudiVolumeEngine()));

        audiStorage.add(new SportCar(BRAND,
                AudiColor.BLACK.getAudiColor(),
                AudiModel.AUDI_A5.getAudiModel(),
                YEAR_OF_PRODUCTION,
                AudiDiameterWheel.NINETEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.TWO_AND_ZERO.getAudiVolumeEngine(),
                2,
                1600));
    }


    AudiModel[] audiModels = AudiModel.values();
    AudiColor[] audiColors = AudiColor.values();
    AudiDiameterWheel[] audiDiameterWheels = AudiDiameterWheel.values();
    AudiVolumeEngine[] audiVolumeEngines = AudiVolumeEngine.values();
    AudiAdditionalOptions[] audiAdditionalOptions = AudiAdditionalOptions.values();

    @Override
    public void listOfModelCar() {
        System.out.println("List of Audi model : "
                + Arrays.toString(audiModels));
    }

    @Override
    public void listOfInstalledMotors() {
        System.out.println("List of installed motors on Audi : "
                + Arrays.toString(audiVolumeEngines));
    }

    @Override
    public void listOfInstalledWheels() {
        System.out.println("List of installed wheels on Audi : "
                + Arrays.toString(audiDiameterWheels));
    }

    @Override
    public void listOfInstalledColor() {
        System.out.println("List of color Audi : "
                + Arrays.toString(audiColors));
    }

    @Override
    public void listOfInstalledAdditionalOptions() {
        System.out.println("List of installed additional options on Audi : "
                + Arrays.toString(audiAdditionalOptions));
    }

    @Override
    public void listCarOnStorage() {
        if (audiStorage.size() < 0) {
            System.out.println("Storage is empty!");
        } else {
            Object[] audiStorageArray = audiStorage.toArray();

            for (Object audiStorage : audiStorageArray) {
                System.out.println(audiStorage);
            }
        }
    }

    @Override
    public Car getCarFromStorage(int numberCatOnStorage) {
        if (numberCatOnStorage > -1 && numberCatOnStorage < audiStorage.size()) {
            Car car = audiStorage.get(numberCatOnStorage - 1);
            return car;
        } else {
            System.out.println("Don't have car on storage!");
            return null;
        }
    }

    @Override
    public void addressFactory() {
        System.out.println("Ingolstadt, Germany");
    }

    @Override
    public PassengerCar createNewPassengerCar(String color, String model,
                                              int diameterOfWheels, double volumeOfEngine) {

        PassengerCar passengerCar = new PassengerCar(BRAND, color, model,
                YEAR_OF_PRODUCTION, diameterOfWheels, volumeOfEngine);
        return passengerCar;
    }

    @Override
    public SportCar createNewSportCar(String color, String model,
                                      int diameterOfWheels, double volumeOfEngine,
                                      int numberOfSeats, int weightSportCar) {

        SportCar sportCar = new SportCar(BRAND, color, model,
                YEAR_OF_PRODUCTION, diameterOfWheels, volumeOfEngine, numberOfSeats, weightSportCar);
        return sportCar;
    }


}
