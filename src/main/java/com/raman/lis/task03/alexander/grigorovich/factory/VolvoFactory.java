package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo.*;
import com.raman.lis.task03.alexander.grigorovich.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VolvoFactory extends CarFactory {

    private int YEAR_OF_PRODUCTION = 2021;
    private String BRAND = "Volvo";

    List<Car> volvoStorage = new ArrayList<>();

    public VolvoFactory(PassengerCar passengerCar, SportCar sportCar,
                        TruckCar truckCar) {
        super(passengerCar, sportCar, truckCar);

        volvoStorage.add(new PassengerCar(BRAND,
                VolvoColor.WHITE.getVolvoColor(),
                VolvoModel.VOLVO_S80.getVolvoModel(),
                YEAR_OF_PRODUCTION,
                VolvoDiameterWheel.SEVENTEENTH.getVolvoDiameterWheel(),
                VolvoVolumeEngine.TWO_AND_FIVE.getVolvoVolumeEngine()));

        volvoStorage.add(new TruckCar(BRAND,
                VolvoColor.BLACK.getVolvoColor(),
                VolvoModel.VOLVO_FN.getVolvoModel(),
                YEAR_OF_PRODUCTION,
                VolvoDiameterWheel.EIGHTEENTH.getVolvoDiameterWheel(),
                VolvoVolumeEngine.TWO_AND_FIVE.getVolvoVolumeEngine(),
                20_000));
    }


    VolvoModel[] volvoModels = VolvoModel.values();
    VolvoColor[] volvoColors = VolvoColor.values();
    VolvoDiameterWheel[] volvoDiameterWheels = VolvoDiameterWheel.values();
    VolvoVolumeEngine[] volvoVolumeEngines = VolvoVolumeEngine.values();
    VolvoAdditionalOptions[] volvoAdditionalOptions = VolvoAdditionalOptions.values();

    @Override
    public void listOfModelCar() {
        System.out.println("List of Volvo model : "
                + Arrays.toString(volvoModels));
    }

    @Override
    public void listOfInstalledMotors() {
        System.out.println("List of installed motors on Volvo : "
                + Arrays.toString(volvoVolumeEngines));
    }

    @Override
    public void listOfInstalledWheels() {
        System.out.println("List of installed wheels on Volvo : "
                + Arrays.toString(volvoDiameterWheels));
    }

    @Override
    public void listOfInstalledColor() {
        System.out.println("List of color Volvo : "
                + Arrays.toString(volvoColors));
    }

    @Override
    public void listOfInstalledAdditionalOptions() {
        System.out.println("List of installed additional options on Volvo : "
                + Arrays.toString(volvoAdditionalOptions));
    }

    @Override
    public void listCarOnStorage() {
        if (volvoStorage.size() < 0) {
            System.out.println("Storage is empty!");
        } else {
            Object[] volvoStorageArray = volvoStorage.toArray();

            for (Object volvoStorage : volvoStorageArray) {
                System.out.println(volvoStorage);
            }
        }
    }

    @Override
    public Car getCarFromStorage(int numberCatOnStorage) {
        if (numberCatOnStorage > -1 && numberCatOnStorage < volvoStorage.size()) {
            Car car = volvoStorage.get(numberCatOnStorage - 1);
            return car;
        } else {
            System.out.println("Don't have car on storage!");
            return null;
        }
    }

    @Override
    public void addressFactory() {
        System.out.println("Gothenburg, Sweden");
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

        System.out.println(BRAND + "does not produce cars of this type");
        return null;
    }

    @Override
    public TruckCar createNewTruckCar(String color, String model,
                                      int diameterOfWheels, double volumeOfEngine,
                                      int liftingCapacity) {

        TruckCar truckCar = new TruckCar(BRAND, color, model,
                YEAR_OF_PRODUCTION, diameterOfWheels, volumeOfEngine, liftingCapacity);
        return truckCar;

    }


}
